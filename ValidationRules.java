package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import employee.Department;
import employee.Employee;
import employeeException.EmployeeException;

public class ValidationRules {

	public static Employee validateAllInputs(String id, String name, String lastName, String dept, double salary,
			String joiningDate, Map<String, Employee> emp) throws EmployeeException {
		checkForDuplicate(id, emp);
		Department validateDept = parseAndValidateDept(dept);
		LocalDate validatejoiningDate = parseAndValidateDate(joiningDate);
		return new Employee(id, name, lastName, validateDept, salary, validatejoiningDate);

	}

	public static void checkForDuplicate(String id, Map<String, Employee> emp) throws EmployeeException {
		if (emp.containsKey(id))
			throw new EmployeeException("Employee id already exist");
		System.out.println("no duplicate");
	}

	public static String validateEmpId(String id, Map<String, Employee> emp) throws EmployeeException {
		if (emp.containsKey(id))
			return id;
		throw new EmployeeException("Employee not found");
	}

	public static LocalDate parseAndValidateDate(String date) throws EmployeeException {
		LocalDate joinDate = LocalDate.parse(date);
		if (Period.between(joinDate, LocalDate.now()).toTotalMonths() > 36)
			throw new EmployeeException("Join date is not valid");
		return joinDate;
	}

	public static Department parseAndValidateDept(String dept) {
		return Department.valueOf(dept.toUpperCase());
	}

}
