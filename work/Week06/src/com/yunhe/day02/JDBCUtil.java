package com.yunhe.day02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	// 注册驱动方法
	static String Driver = null;
	static String Url = null;
	static String Username = null;
	static String Password = null;

	public static void getPro() {
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
		System.out.println(Driver);
	}

	// 创建连接方法
	public static Connection getCon() {
		// 加载驱动
		Connection con = null;
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
	public static int Up(String sql, Connection con, Object[] o) {
		PreparedStatement ps = null;
		int update = 0;
		try {
			ps = con.prepareStatement(sql);
			for (int i = 0; i < o.length; i++) {
				ps.setObject(i + 1, o[i]);
			}
			update = ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return update;

	}

	// 查询方法
	public static ResultSet selt(String sql, Connection con, Object[] o) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			for (int i = 0; i < o.length; i++) {
				ps.setObject(i + 1, o[i]);

			}
			rs = ps.executeQuery();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return rs;

	}

	// 关闭方法
	public static void close(ResultSet rs, PreparedStatement ps, Connection con) {
		try {
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void close(PreparedStatement ps, Connection con) {
		try {

			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		getPro();
		System.out.println(Driver);
		Connection con = getCon();
//准备数据
		String sql = "update student set studentname =?,studentsex=? where studentid=?";
		Object[] o = { "xiaoming", "女", "2010005" };
//		UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值
		System.out.println(Up(sql, con, o));
		String sql1 = "select * from student where studentsex=?";
		Object[] o1 = { "女" };
		ResultSet rs = selt(sql1, con, o1);
		try {
			while (rs.next()) {
				Object studentid = rs.getObject(1);
				Object studentname = rs.getObject(2);
				Object studentage = rs.getObject(3);
				Object studentsex = rs.getObject(4);
				Object studentaddress = rs.getObject(5);
				System.out.println("" + studentid + studentname + studentage + studentsex + studentaddress);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		try {
			rs.close();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}