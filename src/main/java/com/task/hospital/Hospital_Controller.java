package com.task.hospital;

import java.util.Scanner;

public class Hospital_Controller {

	public static void main(String[] args) throws Exception {
		
		Hospital_Service hs= new Hospital_Service();
		
		Patient p = new Patient();
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
				System.out.println("2.See Your Doctor Details");
				int choice2=s.nextInt();
				switch(choice2)
				{
				case 1:
					hs.insert_Patience(p);
					break;
				case 2:
//					hs.insert_Patience(p);
					break;
				}
				break;

			case 2:
//				hs.insert_Doctor(d);
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
