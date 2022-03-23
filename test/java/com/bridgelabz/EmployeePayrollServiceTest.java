package com.bridgelabz;

import static org.junit.Assert.assertEquals;
import static com.bridgelabz.EmployeePayrollService.IOService.DB_IO;
import java.util.List;

import org.junit.Test;

public class EmployeePayrollServiceTest {
	 @Test
	    public void givenEmployeePayrollInDB_whenRetrived_shouldMatchEmployeeCount() {
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
	        List<EmployeePayrollData> employeePayrollData=employeePayrollService.readEmployeePayrollData(DB_IO);
	        assertEquals(3, employeePayrollData.size());
	    }
}
