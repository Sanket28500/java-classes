package utils;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import employee.Employee;

public interface IOUtils {
	static void storeEmployeeDetails(String fileName, Map<String, Employee> emp)
			throws FileNotFoundException, IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(emp);
		}
	}

	@SuppressWarnings("unchecked")
	static Map<String, Employee> restoreEmployee(String fileName)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Map<String, Employee>) in.readObject();
		} catch (Exception e) {
			return new HashMap<>();
		}
	}

}
