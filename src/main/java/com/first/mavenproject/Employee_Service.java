package com.first.mavenproject;

public class Employee_Service {

	public void Insertdata(Employee e) throws Exception {
		
		Employee_Dao e1 = new Employee_Dao();
		e1.insertdata(e);
		
	}

	public void fetchdata(Employee e) throws Exception {
		Employee_Dao e1 = new Employee_Dao();
		e1.fetchdata(e);
		
	}

	public void updatedata(Employee e) throws Exception {
		Employee_Dao e1 = new Employee_Dao();
		e1.updatedata(e);
		
	}

	public void deletedata(Employee e) throws Exception {
		
		Employee_Dao e1 = new Employee_Dao();
		e1.deletedata(e);
	}

}
