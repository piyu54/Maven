package com.service;

import com.dao.DoctorDao;
import com.pojo.Doctor;

public class DoctorService {


	public void insert_Doctor(Doctor d) throws Exception
	{
		DoctorDao h = new DoctorDao();
		h.insertDoctor(d);
		
	}
}
