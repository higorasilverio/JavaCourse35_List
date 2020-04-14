package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int quantity = scanner.nextInt();
		List<Employees> list = new ArrayList<>();
		System.out.println();

		for (int i = 1; i <= quantity; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("ID: ");
			int id = scanner.nextInt();
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Salary: ");
			double salary = scanner.nextDouble();
			list.add(new Employees(id, name, salary));
			System.out.println();
		}

		System.out.print("Enter the employee ID that will have salary increase: ");
		int idToIncrease = scanner.nextInt();
		boolean control = false;
		for (Employees obj : list) {
			if (idToIncrease == obj.getId()) {
				System.out.print("Enter the percentage: ");
				double percentage = scanner.nextDouble();
				obj.increaseSalary(percentage);
				control = true;
			}
		}
		if (control == false)System.out.println("This ID does not exist!");
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employees obj : list) {
			System.out.println(obj);
		}

			scanner.close();
	}

}
