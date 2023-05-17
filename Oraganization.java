package organization;

import static utils.IOUtils.restoreEmployee;
import static utils.IOUtils.storeEmployeeDetails;
import static utils.ValidationRules.parseAndValidateDept;
import static utils.ValidationRules.validateAllInputs;
import static utils.ValidationRules.validateEmpId;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import employee.Employee;

public class Oraganization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;

			Map<String, Employee> emp = restoreEmployee("employee.sre");
			while (!exit) {
				System.out.println(
						"1:Hire new emp, 2. List all emp details,3. Promote an emp,4. Delete emp details, 5. Sort emps as per join date n display the same ");
				System.out.println("Enter your choice");
				try {
					/*
					 * 1. Hire new emp 2. List all emp details 3. Promote an emp 4. Delete emp
					 * details 5. Sort emps as per join date n display the same. 6. We can add many
					 * more options here..... 0. Exit
					 */

					switch (sc.nextInt()) {
					case 1:
						System.out.println("id, name, lastName, dept, salary, joiningDate");
						Employee e = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), emp);
						emp.put(e.getId(), e);
						System.out.println("Employee added successfully");
						break;
					case 2:
						emp.values().forEach(System.out::println);

						break;
					case 3:
						System.out.println("Enter Employee id");
						String key = validateEmpId(sc.next(), emp);
						emp.get(key).setDept(parseAndValidateDept(sc.next()));
						System.out.println("Employee has been promoted");
						break;
					case 4:
						System.out.println("Enter Employee id");
						key = validateEmpId(sc.next(), emp);
						emp.remove(key);
						break;
					case 5:
						emp.values().stream().sorted((p, q) -> p.getJoiningDate().compareTo(q.getJoiningDate()))
								.forEach(System.out::println);
						break;
					case 0:
						exit = true;
						storeEmployeeDetails("employee.sre", emp);
						System.out.println("Exit!!!!");
						break;
					}
				} catch (Exception p) {
					p.printStackTrace();
					sc.nextLine();
				}
			}

		}
	}

}
