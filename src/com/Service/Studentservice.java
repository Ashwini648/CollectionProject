package com.Service;
import java.util.ArrayList;
import java.util.List;
import com.Dao.StudentDao;
import com.enitiy.Student;


public class Studentservice {

	private StudentDao dao; 


	public Studentservice() {
		dao = new StudentDao();
	}
	//Single Student data .....................................1
	public List<Student> getoneStudentService() {
		return dao.getoneStudent();
	}

	//All Student data.........................................2
	public List<Student> getAllStudentService() {
		dao = new StudentDao();
//		List<Student> l1=dao.getallStudent();
		return dao.getallStudent();
	}

	//Student Name start with A..........................................3
	public List<Student> getAllStudentsListNameStartsWith(String ch) {
		List<Student> db = dao.getallStudent();  
		List<Student> db1 = new ArrayList<Student>();  

		for (Student st : db) {
			if (st.getFname().startsWith(ch)) { 
				db1.add(st);  
			}
		}

		return db1;  
	}
	//Student Name Start with Ascending oreder.............................4
	public List<Student> StudentsByFirstNameAscending() {
		List<Student> db2 = getAllStudentService();
		int n = db2.size();
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (db2.get(i).getFname().compareToIgnoreCase(db2.get(j).getFname()) >0) {
					Student temp = db2.get(i);
					db2.set(i, db2.get(j));
					db2.set(j, temp);
				}
			}
		}
		return db2;
	}
	//Student Name Start with Decending oreder.............................5	
	public List<Student> StudentsByFirstNameDescending() {
		List<Student> db3 = getAllStudentService(); 
		int n = db3.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (db3.get(i).getFname().compareToIgnoreCase(db3.get(j).getFname()) < 0) {
					Student temp = db3.get(i);
					db3.set(i, db3.get(j));
					db3.set(j, temp);
				}
			}
		}
		return db3;
	}
	//Student rollno Start with Ascending oreder.............................6
	public List<Student> getStudentsByRollNoAscending() {
		// TODO Auto-generated method stub
		List<Student> db4 = getAllStudentService();
		int n = db4.size();
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (db4.get(j).getRollno() < db4.get(i).getRollno()) {
					Student temp = db4.get(i);
					db4.set(i, db4.get(j));
					db4.set(j, temp);
				}
			}
		}
		return db4;
	}
	//Student Name Start with Decending oreder.............................6
	public List<Student> getStudentsByRollNoDecending() {
		List<Student> db5 = getAllStudentService(); 
		int n = db5.size();
		for (int i = 0; i < n -1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (db5.get(i).getRollno() < db5.get(j).getRollno()) {
					Student temp = db5.get(i);
					db5.set(i, db5.get(j));
					db5.set(j, temp);
				}
			}
		}
		return db5;
	}
	//Maximum mark up student.................................................7
	public List<Student> getStudentWithMaxMarks() {
		List<Student> students = getAllStudentService();
		List<Student> topStudents = new ArrayList<>();
		if (students == null || students.isEmpty()) {
			return topStudents;
		}
		int maxMarks = students.get(0).getMarks();
		for (Student student : students) {
			if (student.getMarks() > maxMarks) {
				maxMarks = student.getMarks();
			}
		}
		for (Student student : students) {
			if (student.getMarks() == maxMarks) {
				topStudents.add(student);
			}
		}

		return topStudents;
	}

	//minimum student marks ......................................8
	public List<Student> getStudentWithMinMarks() {
		List<Student> students = getAllStudentService();
		List<Student> minStudent = new ArrayList<Student>(); 

		if (students == null || students.isEmpty()) {
			return minStudent;
		}
		int minMarks = students.get(0).getMarks();

		// Find the minimum marks
		for (Student student : students) {
			if (student.getMarks() < minMarks) {
				minMarks = student.getMarks();
			}
		}
		for (Student student : students) {
			if (student.getMarks() == minMarks) {
				minStudent.add(student);
			}
		}

		return minStudent;
	}

}



