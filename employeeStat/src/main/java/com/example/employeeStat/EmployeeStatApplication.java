package com.example.employeeStat;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeStatApplication implements CommandLineRunner {

	@Autowired
	private SecretSanta secretSanta;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeStatApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

//		List<Employee> employeeList = FileReaderUtil.readDataFromFile();
//		System.out.println("\n" + employeeList);
//		System.out.println("----------------------------------------------------------------------");
		
		secretSanta.secretSanta();
		System.out.println("----------------------------------------------------------------------");
		
	}

}
