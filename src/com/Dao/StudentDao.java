package com.Dao;

import java.util.ArrayList;
import java.util.List;

import com.enitiy.Student;


public class StudentDao {
	
	
	
	public List<Student> getoneStudent(){
		List<Student> db = new ArrayList<Student>();
		db.add(new Student(1,"Sakshi","Vikash","Nandurakr","Information Technology","@sakshigmail.com",203445678,76));
		return db;
		
	}
	public List<Student> getallStudent(){

		List<Student> db = new ArrayList<Student>();
		db.add(new Student(3,"Gaurav","vialsh","chambhare","Information Technology","@gauravgmail.com",23445678,90));
		db.add(new Student(4,"Aditi","Deepak","Sahare","Computer Technology","aditi@gmail.com",823445678,70));
		db.add(new Student(6,"Ashwini","Prakash","Bondre","Information Technology","ashwini@gmail.com",973445678,95));
		db.add(new Student(2,"Aniket","Dansahewar","Hiware","BBA","aniket@gmail.com",823445678,80));
		db.add(new Student(5,"Suraj","vialsh","Narule","Computer Science","suraj@gmail.com",293445678,35));
		db.add(new Student(1,"Sakshi","Vikash","Nandurakr","Information Technology","@sakshigmail.com",203445678,69));
		return db;
		
		

	
	}

}