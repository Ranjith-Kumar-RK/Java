package com.heraizen.loginStat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.heraizen.loginStat.domain.EmployeeEntry;
import com.heraizen.loginStat.domain.EntryTiming;
import com.heraizen.loginStat.util.FileReaderUtil;

@Component
public class LogTimings {

	public static void employeeLoginInfo() throws IOException, URISyntaxException {
		List<EmployeeEntry> employeeEntryList = FileReaderUtil.readDataUtilFile();
		System.out.println("employeeEntryList" + employeeEntryList);
		Map<String, Integer> compare = new HashMap<>();
		Map<String, EntryTiming> compare1 = new HashMap<>();
		SimpleDateFormat edf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		EntryTiming max = null;

		employeeEntryList.forEach(e -> {
			compare.putIfAbsent(e.getId(), 0);
			compare.computeIfPresent(e.getId(), (k, v) -> v + 1);
		});

		employeeEntryList.forEach(e -> {
			if (compare1.containsKey(e.getId())) {
				compare1.computeIfPresent(e.getId(), (k, v) -> {
					v.setEndTime(e.getTime());
					return v;
				});
			}

			if (!compare1.containsKey(e.getId())) {
				EntryTiming entry = new EntryTiming();
				entry.setStartTime(e.getTime());
				compare1.putIfAbsent(e.getId(), entry);
			}
		});

		compare1.entrySet().stream().forEach(e -> {
			try {
				Date dat = edf.parse(e.getValue().getStartTime());
				Date dat1 = edf.parse(e.getValue().getEndTime());
				long difference_In_Time = dat.getTime() - dat1.getTime();
				e.getValue().setMintue(difference_In_Time / (1000 * 60));
				e.getValue().setHours((difference_In_Time / (1000 * 60)) / 60);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		compare1.entrySet().stream().forEach(e -> {
			System.out.println("Id = " + e.getKey() + " StartTime  = " + e.getValue().getEndTime() + " EndTime = "
					+ e.getValue().getStartTime() + " Mintue = " + e.getValue().getMintue() + " Hours = "
					+ e.getValue().getHours());
		});

		long maxmint = 0, maxhrs = 0;
		String id = null;
		for (Map.Entry<String, EntryTiming> compa : compare1.entrySet()) {
			if (compa.getValue().getMintue() > maxmint) {
				maxmint = compa.getValue().getMintue();
				id = compa.getKey();
				max = compa.getValue();
			}

		}
		for (Map.Entry<String, EntryTiming> compa : compare1.entrySet()) {
			if (compa.getValue().getHours() > maxhrs) {
				maxhrs = compa.getValue().getHours();
				id = compa.getKey();
				max = compa.getValue();
			}

		}
//		System.out.println("id : " + id + max);
		createExcelSheetReportEntry(compare1);
	}

	private static void createExcelSheetReportEntry(Map<String, EntryTiming> mappedEntry) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadsheet = workbook.createSheet(" Employee Working Info ");
		XSSFRow row;
		Set<String> keyid = mappedEntry.keySet();
		int rowid = 0;
		Cell cell;
		row = spreadsheet.createRow(rowid++);
		cell = row.createCell(0);
		cell.setCellValue("Employee Id");
		cell = row.createCell(1);
		cell.setCellValue("Entry Date and Time");
		cell = row.createCell(2);
		cell.setCellValue("Exit Date and Time");
		cell = row.createCell(3);
		cell.setCellValue("Working Time in Mins");
		cell = row.createCell(4);
		cell.setCellValue("Working Time in Hrs");
		spreadsheet.autoSizeColumn(1);
		spreadsheet.autoSizeColumn(2);

		for (String key : keyid) {
			String outTime = "NA";
			row = spreadsheet.createRow(rowid++);
			EntryTiming entryObject = mappedEntry.get(key);

			int cellid = 0;
			cell = row.createCell(cellid++);
			cell.setCellValue(key);
			cell = row.createCell(cellid++);
			cell.setCellValue(entryObject.getStartTime());
			cell = row.createCell(cellid++);
			cell.setCellValue(entryObject.getEndTime());
			cell = row.createCell(cellid++);
			cell.setCellValue(entryObject.getMintue());
			cell = row.createCell(cellid++);
			cell.setCellValue(entryObject.getHours());

		}
		FileOutputStream out = new FileOutputStream(new File("/home/spaneos/EmployeeLogInfo.xlsx"));

		workbook.write(out);
		out.close();
		workbook.close();
	}

}
