package com.yunhe.day02;

import java.util.ArrayList;

public class BigTest {
	public static void main(String[] args) {
		String sql = "select studentid,studentname,studentage,studentsex from student";
		ArrayList<Object> rs = JDBCUtilBig.dql(sql, 4);
		// ArrayList<Student> studentList = new ArrayList<>();
		for (Object student : rs) {
			System.out.println(student);
		}

	}

}
