package com.yunhe.day02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("adc");
//		String s = "cdf";
//		System.out.println(sb.append(s));
//		System.out.println(sb.insert(1, s));
//		System.out.println(sb.delete(0, 2));
//		System.out.println(sb.deleteCharAt(0));
//		System.out.println(s.charAt(0));
//		Date da = new Date();
//		System.out.println(da.getYear());
//		System.out.println(da.getTime());
//		Date d = new Date(2008999);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
//		System.out.println(sdf.format(d));
		Calendar c = Calendar.getInstance();
		c.set(2008, 8, 8);
		c.add(Calendar.YEAR, 10);
		Date time = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		System.out.println(sdf.format(time));
	}
}