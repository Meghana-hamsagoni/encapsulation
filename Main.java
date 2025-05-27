package com.main1;
import com.school1.School;
import com.student.Student;

public class Main {
	public static void main(String[] args) {
		School schoolobj= School.getSchoolObject("SMP", "Hydershakote", "Discipline is mandatory");
		Student studentObj=Student.getStudentObject("Meghana", "A", 78, schoolobj);
		System.out.println(studentObj);
		if (schoolobj==null) {
			System.out.println("Invalid details");
		}
		
	}

}
