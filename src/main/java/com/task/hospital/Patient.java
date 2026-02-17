package com.task.hospital;

import java.sql.Date;

public class Patient {

	
	private int patientId;
    private String patientName;
    private int age;
    private String gender;
    private String disease;
    private Date admitDate;
    private Date dischargeDate;
    private long phone;
    private String address;
    private int doctorId;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public Date getAdmitDate() {
		return admitDate;
	}
	public void setAdmitDate(Date admitDate) {
		this.admitDate = admitDate;
	}
	public Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public Patient(int patientId, String patientName, int age, String gender, String disease, Date admitDate,
			Date dischargeDate, long phone, String address, int doctorId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.disease = disease;
		this.admitDate = admitDate;
		this.dischargeDate = dischargeDate;
		this.phone = phone;
		this.address = address;
		this.doctorId = doctorId;
	}
	public Patient() {
		
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", gender="
				+ gender + ", disease=" + disease + ", admitDate=" + admitDate + ", dischargeDate=" + dischargeDate
				+ ", phone=" + phone + ", address=" + address + ", doctorId=" + doctorId + "]";
	} 
    
    
}
