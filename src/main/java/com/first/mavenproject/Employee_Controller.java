package com.first.mavenproject;

import java.util.Scanner;

public class Employee_Controller {

	public static void main(String[] args) throws Exception {

		Employee_Service s = new Employee_Service();

		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("----------Employee Details------------");
			System.out.println("1. Insert Details");
			System.out.println("2. View Details");
			System.out.println("3. Update Details");
			System.out.println("4. Delete Details");
			System.out.println("5. Exit");

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				s.Insertdata(e);
				break;

			case 2:
				s.fetchdata(e);
				break;

			case 3:
				s.updatedata(e);
				break;

			case 4:
				s.deletedata(e);
				break;

			case 5:
				System.out.println("Thank You!");
				System.exit(0);

			default:
				System.out.println("Invalid Choice!");
			}
		}
	}
}
