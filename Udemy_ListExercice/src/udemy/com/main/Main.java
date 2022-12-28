package udemy.com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import udemy.com.entities.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("How many employee will be registered? ");
		int quantemp = sc.nextInt();

		// add the list according to the
		for (int i = 0; i <= quantemp; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));

		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idincrease = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == idincrease).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!!");
		} else {
			System.out.print("Enter the percentage");
			double percentage = sc.nextDouble();
			emp.increseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for(Employee empl : list) {
			System.out.println(empl);
		}
		
		
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
