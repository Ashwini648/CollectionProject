package com.enitiy;

import java.util.Collections;

public class Student  {

	private int rollno;
	private String fname;
	private String mname;
	private String lname;
	private String department;
	private String email;
	private int mobnumber;
	private int marks;

	Student(){
		super();
	}

	public Student(int rollno, String fname, String mname, String lname, String department, String email,
			int mobnumber,int marks) {
		super();
		this.rollno = rollno;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.department = department;
		this.email = email;
		this.mobnumber = mobnumber;
		this.marks=marks;
	}

	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}

	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the mname
	 */
	public String getMname() {
		return mname;
	}

	/**
	 * @param mname the mname to set
	 */
	public void setMname(String mname) {
		this.mname = mname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobnumber
	 */
	public int getMobnumber() {
		return mobnumber;
	}

	/**
	 * @param mobnumber the mobnumber to set
	 */
	public void setMobnumber(int mobnumber) {
		this.mobnumber = mobnumber;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname
				+ ", department=" + department + ", email=" + email + ", mobnumber=" + mobnumber + ",Grade="+marks+"]";
	}



}


