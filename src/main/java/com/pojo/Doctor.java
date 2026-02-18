package com.pojo;

public class Doctor {

	private int doctorId;
	private String doctorName;
	private String specialization;
	private int experience;
	private double salary;
	private long phone;
	private String email;
	private String gender;
	private String qualification;
	private int roomNumber;
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Doctor(int doctorId, String doctorName, String specialization, int experience, double salary, long phone,
			String email, String gender, String qualification, int roomNumber) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.experience = experience;
		this.salary = salary;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.qualification = qualification;
		this.roomNumber = roomNumber;
	}
	public Doctor() {
		
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", experience=" + experience + ", salary=" + salary + ", phone=" + phone + ", email=" + email
				+ ", gender=" + gender + ", qualification=" + qualification + ", roomNumber=" + roomNumber + "]";
	}
	
	
	

}
