package TestProjects.EmployeeAPI_Test_Project;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestCases {
	
	
	get_ViewEmployeeList viewEmployeeList = new get_ViewEmployeeList();
	get_ViewSingleEmployeeDetail viewEmployeeDetail = new get_ViewSingleEmployeeDetail();
	post_CreateEmployee createEmployee = new post_CreateEmployee();
	put_ChangeEmployeeInformation employeeUpdate = new put_ChangeEmployeeInformation();
	delete_DeleteSingleEmployeeInformation deleteEmployeeByID = new delete_DeleteSingleEmployeeInformation();
	
	@Test
	public void getEmployee_Positive() {
		viewEmployeeList.getEmployeeList();
	}
	
	@Test
	public void createEmployee_Positive() {
		createEmployee.CreateNewEmployee("Leonel messi3", "12344", "32");
		assertEquals(createEmployee.getEmployeeName(), "Leonel messi3");
		System.out.println("the employee name is: "+createEmployee.getEmployeeName());
	}
	
	@Test
	public void getEmployeeDetail() {
		viewEmployeeDetail.viewingEmployeeDetail("");
	}
	
	@Test
	public void updateEmployee() {
		employeeUpdate.updateExistingEmployee("", "", "", "");
	}
	
	@Test
	public void deleteEmployee() {
		deleteEmployeeByID.deleteExistingEmployee("");
	}
	
	
	

}
