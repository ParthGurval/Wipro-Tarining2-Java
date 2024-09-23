package com.wipro.ems.presentation;

import java.util.List;
import java.util.Scanner;

import com.wipro.ems.pojo.Employee;
import com.wipro.ems.service.EmployeeServiceImp;
import com.wipro.ems.service.IEmployeeService;
import com.wipro.exceptions.EmployeeNotFoundException;

public class Client {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		IEmployeeService service = new EmployeeServiceImp();

		boolean flag = true;

		System.out.println("******* WELCOME TO EMS *******");

		while (flag) {

			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. UPDATE EMPLOYEE");

			System.out.println("3. DELETE  EMPLOYEE BY ID");
			System.out.println("4. DISPLAY  EMPLOYEE BY ID");

			System.out.println("5. DISPLAY ALL  EMPLOYEES");

			System.out.println("6. EXIT ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				Employee emp = getEmployee();

				// addEmp() from service

				int count1 = service.addEmployee(emp);

				if (count1 > 0) {

					System.out.println("Employee Added Successfully...");

				}

				else {

					System.err.println("Add Failed...");

				}

				break;

			case 2:
				
				System.out.println("Enter Emp_ID to update record: ");
				int emp_id = scanner.nextInt();
				
				 System.out.println("What would you like to update?");
				    
				 	System.out.println("1. Update Name");
				    System.out.println("2. Update Salary");
				    int subChoice = scanner.nextInt();
				    
				    scanner.nextLine(); // to consume the leftover newline

				Employee upEmp = service.selectEmployeeById(emp_id);
				
				if(upEmp == null) {
					
					try {
						throw new EmployeeNotFoundException();
					} 
					
					catch (EmployeeNotFoundException e) {

						// e.printStackTrace();
						System.out.println("Update Failed");
						System.err.println("Sorry! Employee Not Found for Emp_id " + emp_id);

					}
					
//					System.out.println("Employee Updated Successfully...");
				}
				
				else {
					
					switch (subChoice) {
					
		            case 1:
		            	
		                System.out.println("Enter new emp_name: ");
		                String emp_name = scanner.nextLine();
		                
		                upEmp.setEmp_name(emp_name);
		                
		                break;
		                
		            case 2:
		            	
		                System.out.println("Enter new emp_salary: ");
		                
		                int emp_Salary = scanner.nextInt();
		                
		                upEmp.setEmp_salary(emp_Salary);
		                
		                break;
		                
		            default:
		            	
		                System.err.println("Invalid Option");
		                
		                break;
		                
					}
					
					int count3 = service.updateEmployee(upEmp);
					
					if (count3 > 0) {
			            System.out.println("Employee Updated Successfully...");
			        } else {
			            System.out.println("Update Failed");
			        }
					
				}

				break;

			case 3:

				System.out.println("Enter emp_id to delete record");

				int eid = scanner.nextInt();

				int count2 = service.deleteEmployeeById(eid);

				if (count2 > 0) {

					System.out.println("Employee Deleted Successfully...");

				}

				else {

					try {
						throw new EmployeeNotFoundException();
					} catch (EmployeeNotFoundException e) {

						// e.printStackTrace();
						System.out.println("Delete Failed");
						System.err.println("Sorry! Employee Not Found for emp_id " + eid);

					}

				}

				break;

			case 4:

				System.out.println("Enter emp_id to search record");

				int eid1 = scanner.nextInt();

				Employee employee = service.selectEmployeeById(eid1);

				if (employee != null) {

					System.out.println(employee);

				} else {

					try {
						throw new EmployeeNotFoundException();
					} catch (EmployeeNotFoundException e) {

						// e.printStackTrace();

						System.err.println("Sorry! Employee Not Found for emp_id " + eid1);

					}

				}

				break;

			case 5:

					List<Employee> list =	service.selectAll();
					
						list.forEach( (e1)->{System.out.println(e1);}  );
				
				break;

			case 6:

				flag = false;

				System.out.println("Thank you visit again..");

				break;

			default:
				
					System.err.println("Invalid Option");
				
				break;
			}

		}

	}

	public static Employee getEmployee() { // reading data from K.B

		System.out.println("Enter emp_id ");
		int emp_id = scanner.nextInt();

		scanner.nextLine(); // to control enter key

		System.out.println("Enter emp_name ");
		String emp_name = scanner.nextLine();

		System.out.println("Enter emp_salary");
		int emp_Salary = scanner.nextInt();

		Employee emp = new Employee(emp_id, emp_name, emp_Salary);

		return emp;

	}

}
