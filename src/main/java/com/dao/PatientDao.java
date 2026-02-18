package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.pojo.Patient;

public class PatientDao {
	Scanner s = new Scanner(System.in);
	DoctorDao doctorDao = new DoctorDao();
	public void insert_Patience(Patient p) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "root");
		PreparedStatement ps = con.prepareStatement(
				"insert into patient (patient_name, age, gender, disease, admit_date, phone, address, doctor_id) values (?, ?, ?, ?, ?, ?, ?, ?)");

		System.out.println("Enter Patient Name:");
		String name = s.next();
		p.setPatientName(name);

		System.out.println("Enter Age:");
		int age = s.nextInt();
		p.setAge(age);

		System.out.println("Enter Gender:");
		String gender = s.next();
		p.setGender(gender);

		System.out.println("Enter Disease:");
		String disease = s.next();
		p.setDisease(disease);

		System.out.println("Enter MobNum:");
		long phone = s.nextLong();
		p.setPhone(phone);

		System.out.println("Enter Address:");
		String address = s.next();
		p.setAddress(address);

		System.out.println("Enter Doctor ID to Assign:");
		int doctorId = s.nextInt();
		p.setDoctorId(doctorId);
		

		

		ps.setString(1, p.getPatientName());
		ps.setInt(2, p.getAge());
		ps.setString(3, p.getGender());
		ps.setString(4, p.getDisease());
		ps.setDate(5, p.getAdmitDate());
		ps.setLong(6, p.getPhone());
		ps.setString(7, p.getAddress());
		ps.setInt(8, p.getDoctorId());

		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Successfully Dr assigned");
		} else {
		System.out.println("Dr not assign");

		}
//		if(doctorId==p.getDoctorId())
//		{
//			System.out.println("success this dr have assign");
//			
//		}else {
//			System.out.println("Dr not assign");
//
//		}
		 
	}
}
