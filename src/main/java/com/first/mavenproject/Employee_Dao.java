package com.first.mavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Employee_Dao {

	Scanner s = new Scanner(System.in);

	public void insertdata(Employee e) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Data", "root", "root");

		PreparedStatement ps = con.prepareStatement(
				"insert into Employee(firstname,lastname,email,city,address,mobile,gender,pancard,addarcard,salary)values(?,?,?,?,?,?,?,?,?,?)");

//		System.out.print("Enter ID: ");
//        int id = s.nextInt();
//        s.nextLine();

		System.out.print("Enter firstName: ");
		String firstname = s.nextLine();
		e.setFirstname(firstname);

		System.out.print("Enter lastName: ");
		String lastname = s.nextLine();
		e.setLastname(lastname);

		System.out.print("Enter Email: ");
		String email = s.nextLine();
		e.setEmail(email);

		System.out.print("Enter city: ");
		String city = s.nextLine();
		e.setCity(city);

		System.out.print("Enter Address: ");
		String address = s.nextLine();
		e.setAddress(address);

		System.out.print("Enter mobile number: ");
		long mob = s.nextLong();
		e.setMobile(mob);
		s.nextLine();

		System.out.print("Enter Gender: ");
		String gender = s.nextLine();
		e.setGender(gender);

		System.out.print("Enter Pancard: ");
		String pancard = s.nextLine();
		e.setPancard(pancard);

		System.out.print("Enter Aadharcard: ");
		String aadharcard = s.nextLine();
		e.setAddarcard(aadharcard);

		System.out.print("Enter Salary: ");
		int salary = s.nextInt();
		e.setSalary(salary);

//		ps.setInt(1, e.getId());
		ps.setString(1, e.getFirstname());
		ps.setString(2, e.getLastname());
		ps.setString(3, e.getEmail());
		ps.setString(4, e.getCity());
		ps.setString(5, e.getAddress());
		ps.setLong(6, e.getMobile());
		ps.setString(7, e.getGender());
		ps.setString(8, e.getPancard());
		ps.setString(9, e.getAddarcard());
		ps.setInt(10, e.getSalary());

//     ps.executeBatch();

		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}

	}

	public void fetchdata(Employee e) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Data", "root", "root");
		PreparedStatement ps = con.prepareStatement("select*from employee");
		ResultSet check=ps.executeQuery();

		while(check.next())
		{
			System.out.println(check.getInt(1) +" "+check.getString(2)+" "+check.getString(3)+" "+check.getString(4)+" "+check.getString(5)+" "+check.getString(6)+" "+ check.getLong(7)+""+check.getString(8)+" "+check.getString(9)+" "+check.getString(10)+" "+check.getInt(11)+ " ");
		}
	}

	public void updatedata(Employee e) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Data", "root", "root");
		PreparedStatement ps = con.prepareStatement("update  employee set firstname=? where id=?");
		
		System.out.print("Enter Employee ID: ");
		int id = s.nextInt();
		s.nextLine();

		System.out.print("Enter New Firstname: ");
		String name = s.nextLine();

		ps.setString(1, name);
		ps.setInt(2, id); 
        
//		ps.setString(1, e.getFirstname());
//		ps.setInt(2,e.getId());
//		e.setFirstname(name);
//		e.setAddress(address);
//        ps.setString(1, name);        
//        ps.setString(2, address);  
//        e.setFirstname(e.getFirstname());
       
		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}
	}
	
	public void deletedata(Employee e) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Data", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from employee where id=?");

		System.out.print("Enter ID to delete: ");
        int id = s.nextInt();
		ps.setInt(1, id);
		

		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Data deleted");
		} else {
			System.out.println("Data not deleted");
		}
	}
}
