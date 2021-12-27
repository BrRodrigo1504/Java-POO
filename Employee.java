package entities;

public class Employee {

	public String name;
	public double salary;
	public double tax = 1000.0;
	public double percentage;
	
	public double NetSalary() {
		return (salary - tax); 
	}

	public double IncreaseSalary(){
		 return ((salary * ((percentage / 100) + 1.00)) - tax);  
		
	}
}
