package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.pojo.Doctor;

public class DoctorDao {

	Scanner s = new Scanner(System.in);
	public void insertDoctor(Doctor d) throws Exception {

        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into doctor(doctor_name, specialization, experience, salary, phone, email, gender, qualification, room_number)values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		
		System.out.println("Enter Doctor Name:");
		String name = s.next();
		d.setDoctorName(name);

		System.out.println("Enter Specialization:");
		String specialization = s.next();
		d.setSpecialization(specialization);

		System.out.println("Enter Experience:");
		int experience = s.nextInt();
		d.setDoctorId(experience);

		System.out.println("Enter Salary:");
		double salary = s.nextDouble();
		d.setSalary(salary);

		System.out.println("Enter Phone:");
		long phone = s.nextLong();
		d.setPhone(phone);

		System.out.println("Enter Email:");
		String email = s.next();
		d.setEmail(email);

		System.out.println("Enter Gender:");
		String gender = s.next();
		d.setGender(gender);

		System.out.println("Enter Qualification:");
		String qualification = s.next();
		d.setQualification(qualification);

		System.out.println("Enter Room Number:");
		int room = s.nextInt();
		d.setRoomNumber(room);

		
		
		ps.setString(1, d.getDoctorName());
        ps.setString(2, d.getSpecialization());
        ps.setInt(3, d.getExperience());
        ps.setDouble(4, d.getSalary());
        ps.setLong(5, d.getPhone());
        ps.setString(6, d.getEmail());
        ps.setString(7, d.getGender());
        ps.setString(8, d.getQualification());
        ps.setInt(9, d.getRoomNumber());

        int check = ps.executeUpdate();


		if (check>0) {
		    System.out.println("Doctor added successfully!");
		} else {
		    System.out.println("Failed to add doctor.");
		}
		
        
 }
//	public boolean isDoctorPresent(int doctorId) throws Exception {
//		boolean status=false;
//	
//	        
//	        Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "root");
//			PreparedStatement ps = con.prepareStatement("SELECT * FROM doctor WHERE id = ?");
//			
//	        ps.setInt(1, doctorId);
//
//	        ResultSet rs = ps.executeQuery();
//
//	        if (rs.next()) {
//	            status = true;
//	        
//		
//		return false;
//	}
//			return status;
//	}
}
