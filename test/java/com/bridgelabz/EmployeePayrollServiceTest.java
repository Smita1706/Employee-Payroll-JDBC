package com.bridgelabz;

import  org.junit.Assert;
import static com.bridgelabz.EmployeePayrollService.IOService.DB_IO;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

public class EmployeePayrollServiceTest {
	@Test
	public void givenEmployeePayrollInDB_whenRetrived_shouldMatchEmployeeCount() {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		List<EmployeePayrollData> employeePayrollData=employeePayrollService.readEmployeePayrollData(DB_IO);
		Assert.assertEquals(3, employeePayrollData.size());
	}
	@Test
	public void givenNewSalaryForEmployee_WhenUpdated_ShouldSyncWithDB() {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(DB_IO);
		employeePayrollService.updateEmployeeSalary("Terisa", 4000000.0);
		boolean result = employeePayrollService.checkEmployeeInSyncWithDB("Terisa");
		Assert.assertTrue(result);
	}
	  @Test
	    public void givenEmployeePayrollDB_AbilityToRetrievAllTheEmployees_JoinedInParticularDataRanga() {
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
	        List<EmployeePayrollData> employeePayrollData=employeePayrollService.readEmployeePayrollData(DB_IO);
	        List<EmployeePayrollData> employeePayrollDataByGivenDataRange = employeePayrollService.getEmployeePayrollDataByGivenDataRange(LocalDate.of(2018, 01, 01), LocalDate.now());
	        Assert.assertEquals(employeePayrollDataByGivenDataRange.get(0),employeePayrollData.get(0));
	    }
}
