package iostream.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollMain {
	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	static ArrayList<EmployeeData> emplist = new ArrayList<>();

	public EmployeePayRollMain(List<EmployeeData> list) {
		// TODO Auto-generated constructor stub
	}

	public EmployeePayRollMain(ArrayList<EmployeeData> emplist) {

		this.emplist = emplist;
	}

	public static boolean reademployeedata() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		int id = scan.nextInt();
		System.out.println("Enter Employee Name :");
		String name = scan.next();
		System.out.println("Enter Employee Salary :");
		double salary = scan.nextDouble();
		emplist.add(new EmployeeData(id, name, salary));
		return true;

	}

	public static boolean writeemployeedata() {
		System.out.println("\n Writing Employee Payroll Roaster to Console \n" + emplist);
		return true;
	}

	public static boolean createfile() {

		File file = new File("C:\\Users\\Goutham\\MyFile.txt");
		try {
			FileWriter writer = new FileWriter("C:\\Users\\Goutham\\MyFile.txt");
			writer.write("Welcome to java world!");
			writer.close();
			System.out.println("Success");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (file.exists()) {
			file.deleteOnExit();
			System.out.println("File has deleted ");
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File have created");
		}
		return true;
	}

	public static boolean readpayroll() {
		EmployeeData emp1 = new EmployeeData(2, "smith", 20000);
		EmployeeData emp2 = new EmployeeData(4, "Allen", 25000);
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.forEach(System.out::println);
		System.out.println(emplist.size());
		return true;
	}

	public static boolean emptypayroleadd() throws IOException {
		readpayroll();
		addtofile(emplist);
		return true;
	}

	public static void addtofile(ArrayList<EmployeeData> emplist) throws IOException {
		FileWriter filewriter = new FileWriter(
				"C:\\Users\\Goutham\\eclipse-workspace\\iostream\\src\\main\\output.txt");
		for (EmployeeData str : emplist) {
			filewriter.write(str + System.lineSeparator());
		}

		filewriter.close();
	}

	public static void diplayData() throws IOException {
		Files.lines(new File("C:\\Users\\Goutham\\eclipse-workspace\\iostream\\src\\main\\output.txt").toPath())
				.forEach(System.out::println);
	}

	public static long countdata() throws IOException {
		long value = Files
				.lines(new File("C:\\Users\\Goutham\\eclipse-workspace\\iostream\\src\\main\\output.txt").toPath())
				.count();
		return value;

	}

}
