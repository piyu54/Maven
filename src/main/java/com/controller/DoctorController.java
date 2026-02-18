package com.controller;

import java.util.Scanner;

import com.pojo.Doctor;
import com.service.DoctorService;

public class DoctorController {

	public static void main(String[] args) {
		DoctorService hs = new DoctorService();

		Doctor d = new Doctor();

		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.println("---------- Details------------");
			System.out.println("1. Patient");
			System.out.println("2. Doctor");
			System.out.println("3. Exit");

			System.out.print("Enter choice: ");
			int choice = s.nextInt();

			switch (choice) {

			case 1:
				System.out.println("-------------Patient Details---------");
				System.out.println("1.Insert Your details");
//				System.out.println("2.Update  Patient Details");
//				System.out.println("3.Delete  Patient Details");
				System.out.println("4.See Your Doctor Details");
				int choice2 = s.nextInt();
				switch (choice2) {
				case 1:
//					hs.insert_Patience(p);
					break;
				case 2:
//					
					break;
				}
				break;

			case 2:
//				System.out.println("-------------Patient Details---------");
				System.out.println("1.Insert Doctor details");
				System.out.println("2.See  Patient Details");
				System.out.println("3.Update Patient Details");
				System.out.println("4.Delete Patient Details");
				int choice3 = s.nextInt();
				switch (choice3) {
				case 1:
//					hs.insert_Doctor(d);
					break;
				case 2:
//					hs.insert_Patience(p);
					break;
				}
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
