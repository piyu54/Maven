package com.service;

import com.dao.DoctorDao;
import com.dao.PatientDao;
import com.pojo.Patient;

public class PatientService {

	
	public void insert_Patience1(Patient p) throws Exception
	{
		PatientDao h= new PatientDao();
		h.insert_Patience(p);
		 DoctorDao doctorDao = new DoctorDao();

		    if (doctorDao.isDoctorPresent(p.getDoctorId())) {

		        PatientDao patientDao = new PatientDao();
		        patientDao.insert_Patience(p);

		        System.out.println("Doctor Assigned Successfully");

		    } else {

		        System.out.println("Doctor ID not found. Cannot assign.");
		    }
		
	}
	
	

}
