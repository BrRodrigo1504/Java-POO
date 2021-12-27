package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee x;
		x = new Employee();
		
		System.out.println("Insert you Name:");
		x.name = sc.nextLine();
		System.out.println("Insert your Salary:");
		x.salary= sc.nextDouble();
			
		double NetSalary = x.NetSalary();
		double IncreaseSalary = x.IncreaseSalary();
		System.out.println("Which percentage to increase salary:");
		x.percentage = sc.nextDouble();
		
		System.out.printf("\nEmployee : %s, $ %.2f ", x.name, x.NetSalary() );
		System.out.printf("\nUpdated data: %s , %.2f", x.name, x.IncreaseSalary());
	}

}
