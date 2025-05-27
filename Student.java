package com.student;
import com.school1.School;

public class Student {
	private String studentName;
	private String grade;
	private double averageMarks;
	private School school;
	private Student (String studentName,String grade, double averageMarks, School school ) {
		this.studentName=studentName;
		this.grade=grade;
		this.averageMarks=averageMarks;
		this.school=school;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getAverageMarks() {
		return averageMarks;
	}
	public void setAverageMarks(double averageMarks) {
		if (averageMarks<0 || averageMarks>100) {
			this.averageMarks=0;
		}
		else 
		this.averageMarks = averageMarks;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		if (school==null) {
			this.school=null;
		}
		else 
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", grade=" + grade + ", averageMarks=" + averageMarks
				+ ", school=" + school + "]";
	}
	public static Student getStudentObject(String studentName, String grade,double averageMarks, School school) {
		return new Student(studentName, grade, averageMarks,school);
	}

}
