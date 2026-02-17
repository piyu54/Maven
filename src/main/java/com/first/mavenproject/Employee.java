package com.first.mavenproject;

public class Employee {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String city;
	private String address;
	private long mobile;
	private String gender;
	private String pancard;
	private String addarcard ;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getAddarcard() {
		return addarcard;
	}
	public void setAddarcard(String addarcard) {
		this.addarcard = addarcard;
	}
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String firstname, String lastname, String email, String city, String address, long mobile,
			String gender, String pancard, String addarcard, int salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
		this.address = address;
		this.mobile = mobile;
		this.gender = gender;
		this.pancard = pancard;
		this.addarcard = addarcard;
		this.salary=salary;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", city=" + city + ", address=" + address + ", mobile=" + mobile + ", gender=" + gender + ", pancard="
				+ pancard + ", addarcard=" + addarcard + ", salary=" + salary + "]";
	}
	
	
	
	}
	
	
	
	
	
	

