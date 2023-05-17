package employee;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {

	private String id;
	private String name, lastName;
	private Department dept;
	private double salary;
	private LocalDate joiningDate;
//	private static LocalDate establisheDate;

//	public LocalDate getEstablisheDate() {
//		return establisheDate;
//	}
//
//	public void setEstablisheDate(LocalDate establisheDate) {
//		Employee.establisheDate = establisheDate;
//	}

	public Employee(String id, String name, String lastName, Department dept, double salary, LocalDate joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dept = dept;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Department getDept() {
		return dept;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", dept=" + dept + ", salary="
				+ salary + ", joiningDate=" + joiningDate + "]";
	}

}
