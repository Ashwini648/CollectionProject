package com.dao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.enitiy.Student;


public class Studentdao {

	public List<Student> addStudents() { 
		List<Student> db = new ArrayList<>(); 
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println("Enter the number of students: ");
		 
		for (int i = 1; i <= N; i++) {
			System.out.println("Enter " + i + "th Student roll: ");
			int r = scan.nextInt();
			System.out.println("Enter " + i + "th Student fname: ");
			String f = scan.next();
			System.out.println("Enter " + i + "th Student mname: ");
			String m = scan.next();
			System.out.println("Enter " + i + "th Student lname: ");
			String l = scan.next();
			System.out.println("Enter " + i + "th Student department: ");
			String d = scan.next();
			System.out.println("Enter " + i + "th Student email: ");
			String e = scan.next();
			System.out.println("Enter " + i + "th Student mobnumber: ");
			int mob = scan.nextInt();
			System.out.println("Enter " + i + "th Student mobnumber: ");
			int grade = scan.nextInt();
			Student s1 = new Student(r, f, m, l, d, e, mob,grade);
			db.add(s1); 
		}
		return db;
	}
}


