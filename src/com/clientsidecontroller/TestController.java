package com.clientsidecontroller;

import java.util.List;
import com.enitiy.Student;
import com.Controller.StudentControll;

public class TestController { 

	public static void main(String[] args) {

		StudentControll s = new StudentControll();

		// Fetching all students
		List<Student> allStudents = s.getallStudentscotroller();

		System.out.println("Single student data:");
		List<Student> db = s.getallStudentscotroller();
		System.out.println(allStudents);
		System.out.println(db+"\n");
		System.out.println("...........................................................................");


		System.out.println("All Students:");
		for (Student student : allStudents) {
			System.out.println(student);
		}

		System.out.println("...........................................................................");


		List<Student> studentsWithA = s.getallStudentsListnamestartswith("A");
		System.out.println("\nStudents whose names start with 'A':");
		for (Student student : studentsWithA) {
			System.out.println(student);
		}

		System.out.println("...........................................................................");


		System.out.println("Name Start with Ascending order");
		List<Student> AsStudents = s.getStudentsByFirstNameAscending();
		for (Student student : AsStudents) {
			System.out.println(student);
		}
		System.out.println("...........................................................................");


		System.out.println("Name Start with Descending order");
		List<Student> DeStudents = s.getStudentsByFirstNameDecending();
		for (Student student : DeStudents) {
			System.out.println(student);
		}
		System.out.println("...........................................................................");


		System.out.println("Rollno Start with Ascending order");
		List<Student> rollStudents = s.getStudentsByRollNoAscending();
		for (Student student :rollStudents) {
			System.out.println(student);
		}
		System.out.println("...........................................................................");

		System.out.println("Rollno Start with Decending order: ");
		List<Student> rollnoStudents = s.getStudentsByRollNoDecending();
		for (Student student :rollnoStudents) {
			System.out.println(student);
		}
		System.out.println("...........................................................................");

		System.out.println("Maximum marks of student: ");
		List<Student> maxStudents = s.getStudentWithMaxMarks();
		for (Student student :maxStudents) {
			System.out.println(student);
		}
		System.out.println("...........................................................................");

		System.out.println("Minimum marks of student: ");
		List<Student> minStudents = s.getStudentWithMinMarks();
		for (Student student :minStudents) {
			System.out.println(student);
		}
		System.out.println("...........................................................................");

	}
}