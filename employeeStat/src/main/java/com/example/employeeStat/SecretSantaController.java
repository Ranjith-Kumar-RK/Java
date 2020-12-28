package com.example.employeeStat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeStat.domain.Member;

@Component
@RestController
public class SecretSantaController {

	@Autowired
	private SecretSanta secretSanta;

	@GetMapping("/members")
	public Map<Member, Member> getMembers() throws IOException {

		createExcelSheetReportEntry(secretSanta.secretSanta());
		return secretSanta.secretSanta();

	}

	private void createExcelSheetReportEntry(Map<Member, Member> map) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet spreadsheet = workbook.createSheet(" Secret Santa ");

		XSSFRow row;

		Set<Member> keyid = map.keySet();
		int rowid = 0;
		Cell cell;
		row = spreadsheet.createRow(rowid++);
		cell = row.createCell(0);
		cell.setCellValue("Name");
		cell = row.createCell(1);
		cell.setCellValue("Email");
		cell=row.createCell(2);
		cell.setCellValue("Friend");
		for (Member member : keyid) {
			row = spreadsheet.createRow(rowid++);
			Member entryObject = map.get(member);
			int cellid = 0;
			cell = row.createCell(cellid++);
			cell.setCellValue(entryObject.getName());

			cell = row.createCell(cellid++);
			cell.setCellValue(entryObject.getEmail());
			
			cell = row.createCell(cellid++);
			cell.setCellValue(entryObject.getName());
		}

		FileOutputStream out = new FileOutputStream(new File("/home/spaneos/Downloads/SecretSantaGame.xlsx"));

		workbook.write(out);
		out.close();
		workbook.close();
		System.out.println("Writesheet.xlsx written successfully");

	}

}
