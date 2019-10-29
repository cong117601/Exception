package com.yunhe.day02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class JDBCUtilBig {
	// 注册驱动
	private static String Driver = null;
	private static String Url = null;
	private static String Username = null;
	private static String Password = null;
	private static Connection con = null;
	private static PreparedStatement ps = null;;
	private static ResultSet rs = null;
	private static int update = 0;
//静态代码块  执行时 只执行一次
	static {
		Properties p = new Properties();
		InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("Driver.Properties");
		try {
			p.load(is);
		} catch (IOException e) {

			e.printStackTrace();
		}
		Driver = p.getProperty("Driver");
		Url = p.getProperty("Url");
		Username = p.getProperty("Username");
		Password = p.getProperty("Password");

	}

	// 创建连接方法
	private static Connection getCon() {
		// 加载驱动

		try {
			Class.forName(Driver);
			con = DriverManager.getConnection(Url, Username, Password);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		// System.out.println("111");
		return con;
	}

	// 更新方法
	private static int up(String sql, Object... o) {

		try {
			ps = con.prepareStatement(sql);
			// 将数据填入
			for (int i = 0; i < o.length; i++) {
				ps.setObject(i + 1, o[i]);
			}
			update = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return update;
	}

	public static int uplast(String sql, Object... o) {
		getCon();
		int update = up(sql, o);
		close();
		return update;
	}

	// 查询方法
//	private static ResultSet resut(String sql, Object... o) {
//
//		try {
//			ps = con.prepareStatement(sql);
//			// 将数据填入
//			for (int i = 0; i < o.length; i++) {
//				ps.setObject(i + 1, o[i]);
//			}
//			rs = ps.executeQuery();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return rs;
//	}
//
//	public static void result1(String sql) {
//		getCon();
//		try {
//			ps = con.prepareStatement(sql);
//			rs = ps.executeQuery();
//			// 获取数据集属性信息
//			ResultSetMetaData metaData = ps.getMetaData();
//			int columnCount = metaData.getColumnCount();
//			while (rs.next()) {
//				for (int j = 1; j <= columnCount; j++) {
//					System.out.print(rs.getObject(j));
//				}
//				System.out.println();
//			}
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//		close();
//
//	}

	// 使用对象变量将result的结果先拿出保存
	// 为每个类单独书写保存格式例如Student
//	private static ArrayList<Student> StudentSelect(String sql, Object... o) {
//		ArrayList<Student> arr = new ArrayList<>();
//
//		try {
//			ps = con.prepareStatement(sql);
//			for (int i = 0; i < o.length; i++) {
//				ps.setObject(i + 1, o[i]);
//			}
//			rs = ps.executeQuery();
//			while (rs.next()) {
//				Student s = new Student();
//				int id = rs.getInt("studentid");
//				String name = rs.getString("studentname");
//				String sex = rs.getString("studentage");
//				int age = rs.getInt("studentsex");
//				s.setStudentid(id);
//				s.setStudentname(name);
//				s.setStudentage(age);
//				s.setStudentsex(sex);
//				arr.add(s);
//			}
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		return arr;
//	}
//
//	public static ArrayList<Student> studentSelt(String sql, Object... o) {
//		getCon();
//		ArrayList<Student> arr = StudentSelect(sql, o);
//		close();
//		return arr;
//	}

	// 公共查询方法 集查询返回数据关闭连接一起
	// 2.0.2将每条数据 按照表的格式位置 放入arrayList中
	// 将所有数据放入另一个arraylist中
	private static ArrayList<Object> selectObject(String sql, int colNumber, Object... o) {
		ArrayList<Object> arr = new ArrayList<>();
		try {
			ps = con.prepareStatement(sql);
			for (int i = 0; i < o.length; i++) {
				ps.setObject(i + 1, o[i]);
			}
			rs = ps.executeQuery();
			while (rs.next()) {
				ArrayList<Object> arr1 = new ArrayList<>();
				for (int j = 1; j <= colNumber; j++) {
					arr1.add(rs.getObject(j));
				}

				if (!arr1.isEmpty()) {
					arr.add(arr1);
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr;
	}

	public static ArrayList<Object> dql(String sql, int colNumber, Object... o) {
		getCon();
		ArrayList<Object> arr = selectObject(sql, colNumber, o);
		close();
		return arr;
	}

	// 关闭方法
	private static void close() {
		try {
			// 判断是否为null
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
