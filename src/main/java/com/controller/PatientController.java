package com.controller;

import java.util.Scanner;

import com.pojo.Patient;
import com.service.PatientService;

public class PatientController {

	public static void main(String[] args) throws Exception {
		
		PatientService p=new PatientService();
		Patient ps= new Patient();
		
		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.println("---------- Patient Details------------");
			System.out.println("1.Insert Your details");
//			System.out.println("2.Update  Patient Details");
//			System.out.println("3.Delete  Patient Details");
			System.out.println("2.See Your Doctor Details");

			System.out.print("Enter choice: ");
			int choice = s.nextInt();

			switch (choice) {

			case 1:
				p.insert_Patience1(ps);
//				p.insert_Patience(ps);
					break;

			case 2:
			
				break;

			case 3:

				System.out.println("Exiting...");
				System.exit(0);

			default:
				System.out.println("Invalid Choice!");

			}
		}
	}
}
