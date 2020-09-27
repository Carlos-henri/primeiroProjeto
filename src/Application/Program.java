Cpackage Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee product = new Employee();
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		product.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		product.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ product);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		int pecetagem = sc.nextInt();
		product.increaseSalary(pecetagem);
		
		System.out.println();
		System.out.println("Updated data: "+ product);
		
		
		
		
		
		
		
		
       
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
