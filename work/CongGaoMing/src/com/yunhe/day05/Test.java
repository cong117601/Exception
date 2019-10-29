package com.yunhe.day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //1. 获取指定位置字符
		String a = "abcdefg";
		for (int i = 0; i <= a.length() - 1; i++) {
			a.charAt(2);// 获取指定位置字符
			
		}
		System.out.println(a.charAt(2));
  //2. 统计字符串中大小写个数
		int dx = 0;
		int xx = 0;
		char[] ch = a.toCharArray();// 把字符串 转换为字符数组
		for (int i = 0; i < ch.length; i++) {// 遍历字符串数组ch[]
			if (Character.isUpperCase(ch[i])) {// isUpperCase()判断字符串大写字母
				dx++;
			} else if (Character.isLowerCase(ch[i])) {// isLowerCase()判断字符串小写字母
				xx++;
			}
		}
		System.out.println(dx);
		System.out.println(xx);
  // 3.将字符串首字母变为大写，其余字母变为小写
		String a1 = a.substring(0, 1);// 截取第一个字符串 （从0 到1 中间的字符）
		// System.out.println(a1);
		String f = a1.toUpperCase(); // 返回指定字符串中所有字母大写形式的字符串
		// System.out.println(f);
		String a2 = a.substring(1);// 截取1 后面的字符串
		String f1 = a2.toLowerCase();// 返回指定字符串中所有字母小写形式的字符串
		System.out.println("转换后的字符串：" + f + f1);
  //4.给定一个字符串找到子串在字符串中出现的次数
		//String s = "abcitcastabcxxxabc"中的"abc"	
		String s ="abcitcastabcxxxabc";
		String stofind ="abc";
		int c=0;//定义c变量 保存出现次数
		int start =0;
		while (s.indexOf(stofind, start) >= 0 && start < s.length()) {
			c++;
			start = s.indexOf(stofind, start) +stofind.length();
			}
		System.out.println(stofind + "在" + s + "出现的次数为" + c);
  //5.计算你来这个世界多少天
		
			Calendar ca = Calendar.getInstance();	//获取Calendar.getInstance()对象ca
			  ca.set(1997, 8, 9,17, 50, 30);
       // System.out.print(ca.set(2019, 8, 9,17, 50, 30)); 

	
		
		ca.getTimeInMillis();
		 int day= (int)ca.getTimeInMillis() /1000/60/60/24/345;
		// System.out.println(day);
  //6.获取昨天的这个时刻  
		 Calendar calendar = new GregorianCalendar();//创建Canlendar 类对象calendar
		 calendar.add(calendar.DATE, -1);//添加日期到前一天
		 Date d2=calendar.getTime();
		 SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd");//格式转换
		 String ZUOTIAN=sp.format(d2);
	   System.out.println(ZUOTIAN);
  //7.如何获得任意年份二月有多少天？
		 
	}

}