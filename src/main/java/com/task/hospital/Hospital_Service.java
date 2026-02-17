package com.task.hospital;

public class Hospital_Service {

	public void insert_Patience(Patient p) throws Exception
	{
		Hospital_Dao h = new Hospital_Dao();
		h.insert_Patience(p);
		
	}
	
	public void insert_Doctor(Doctor d) throws Exception
	{
		Hospital_Dao h = new Hospital_Dao();
		h.insertDoctor(d);
		
	}
	
	
	
}
