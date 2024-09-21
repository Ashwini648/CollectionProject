package com.Controller;


import java.util.List;

import com.enitiy.Student;
import com.Service.Studentservice;

public class StudentControll {

	Studentservice Service = null;

	public List<Student> getoneStudentscotroller(){

		Service = new Studentservice();

		List<Student> db = Service.getoneStudentService();

		return db;
	}

	public List<Student> getallStudentscotroller(){

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentService();

		return db;
	}

	public List<Student> getallStudentsListnamestartswith(String ch) {

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentsListNameStartsWith(ch);

		return db;

	}

	public List<Student> getStudentsByFirstNameAscending() {

		Service = new Studentservice();

		List<Student> db = Service.StudentsByFirstNameAscending();

		return db;

	}
	public List<Student> getStudentsByFirstNameDecending() {

		Service = new Studentservice();

		List<Student> db = Service.StudentsByFirstNameDescending();

		return db;

	}
	public List<Student> getStudentsByRollNoAscending() {
		// TODO Auto-generated method stub

		Service = new Studentservice();

		List<Student> db = Service.getStudentsByRollNoAscending();
		return db;
	}


	public List<Student> getStudentsByRollNoDecending() {
		// TODO Auto-generated method stub
		Service = new Studentservice();

		List<Student> db = Service.getStudentsByRollNoDecending();
		return db;
	}

	public List<Student> getStudentWithMaxMarks() {
		Service = new Studentservice();

		List<Student> db = Service.getStudentWithMaxMarks();
		return db;
	}
	public List<Student> getStudentWithMinMarks() {
		Service = new Studentservice();

		List<Student> db = Service.getStudentWithMinMarks();
		return db;
	}

}