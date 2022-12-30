package com.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.entities.enums.WorkerLevel;
import com.entities.worker.Department;
import com.entities.worker.HourContract;
import com.entities.worker.Worker;

public class Principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department name: ");
		String departmentName = sc.nextLine();
		
		System.out.print("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level (JUNIOR/MID_LEVEL/SENIOR) : ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		/*instanciou um novo obj do tipo "worker", esse obj recebe como parametros:
		"workName" tipo String 
		uma instancia de "WorkerLevel" com o valor que é digitado
		"baseSalary tipo double
		associado ao obj worker tem um obj do tipo departamento na qual 
		o nome desse departamento vai ser o nome que sera digitado
		
		*/
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sd.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");		
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f",  worker.income(year, month)));
		
	}

}
