package bridgelabz.com.iostream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;
import iostream.model.EmployeePayRollMain;

public class EmployeePayRollMainTest {

	@Test
	public void readpayrollTest() {
		boolean payroll = EmployeePayRollMain.readpayroll();
		assertEquals(true, payroll);
	}

	@Test
	public void emptypayroleaddTest() throws IOException {

		boolean addedemply = EmployeePayRollMain.emptypayroleadd();
		EmployeePayRollMain.diplayData();
		long val = EmployeePayRollMain.countdata();
		assertEquals(2, val);
	}

	@Test
	public void reademployeedataTest() throws IOException {

		try {
			boolean reademp = EmployeePayRollMain.reademployeedata();
			EmployeePayRollMain.writeemployeedata();
			assertEquals(true, reademp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void createfileTest() throws IOException {

		boolean create = EmployeePayRollMain.createfile();
		assertEquals(true, create);
	}
}
