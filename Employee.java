package Day10;

import java.util.Scanner;

public class Employee {
	public void grosssalary(double salary) {
		double bonus = 50/100*salary;
		double gross = bonus + salary;
		System.out.println("Gross salary : " + gross);
	}
 }

 class MAin {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter basic salary");
			 double result = sc.nextDouble();
			 
			 Employee emp = new Employee();
			 emp.grosssalary(result);
	 }
}
