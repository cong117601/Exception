package com.yunhe.day02;

public class Student {
	private int studentid;
	private String studentname;
	private int studentage;
	private String studentsex;
	private String studentaddress;

	public Student() {
		super();
	}

	public Student(int studentid, String studentname, int studentage, String studentsex, String studentaddress) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentage = studentage;
		this.studentsex = studentsex;
		this.studentaddress = studentaddress;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	public String getStudentsex() {
		return studentsex;
	}

	public void setStudentsex(String studentsex) {
		this.studentsex = studentsex;
	}

	public String getStudentaddress() {
		return studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage
				+ ", studentsex=" + studentsex + ", studentaddress=" + studentaddress + "]";
	}

}
