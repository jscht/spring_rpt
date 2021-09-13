package com.codesample.academy.data;

public class Teachers {
// 강사아이디, 강사이름, 전문분야, 개설수업리스트(개설수업아이디, 개설수업이름)
	private String teacherId;
	private String teacherName;
	private String specialty;
	private String openClasses;
	
	public Teachers() {}
	public Teachers(String teacherId, String teacherName,
			String specialty, String openClasses) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.specialty = specialty;
		this.openClasses = openClasses;
	}
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	public String getOpenClasses() {
		return openClasses;
	}
	public void setOpenClasses(String openClasses) {
		this.openClasses = openClasses;
	}

}
