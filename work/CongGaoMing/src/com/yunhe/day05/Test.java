package com.yunhe.day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //1. ��ȡָ��λ���ַ�
		String a = "abcdefg";
		for (int i = 0; i <= a.length() - 1; i++) {
			a.charAt(2);// ��ȡָ��λ���ַ�
			
		}
		System.out.println(a.charAt(2));
  //2. ͳ���ַ����д�Сд����
		int dx = 0;
		int xx = 0;
		char[] ch = a.toCharArray();// ���ַ��� ת��Ϊ�ַ�����
		for (int i = 0; i < ch.length; i++) {// �����ַ�������ch[]
			if (Character.isUpperCase(ch[i])) {// isUpperCase()�ж��ַ�����д��ĸ
				dx++;
			} else if (Character.isLowerCase(ch[i])) {// isLowerCase()�ж��ַ���Сд��ĸ
				xx++;
			}
		}
		System.out.println(dx);
		System.out.println(xx);
  // 3.���ַ�������ĸ��Ϊ��д��������ĸ��ΪСд
		String a1 = a.substring(0, 1);// ��ȡ��һ���ַ��� ����0 ��1 �м���ַ���
		// System.out.println(a1);
		String f = a1.toUpperCase(); // ����ָ���ַ�����������ĸ��д��ʽ���ַ���
		// System.out.println(f);
		String a2 = a.substring(1);// ��ȡ1 ������ַ���
		String f1 = a2.toLowerCase();// ����ָ���ַ�����������ĸСд��ʽ���ַ���
		System.out.println("ת������ַ�����" + f + f1);
  //4.����һ���ַ����ҵ��Ӵ����ַ����г��ֵĴ���
		//String s = "abcitcastabcxxxabc"�е�"abc"	
		String s ="abcitcastabcxxxabc";
		String stofind ="abc";
		int c=0;//����c���� ������ִ���
		int start =0;
		while (s.indexOf(stofind, start) >= 0 && start < s.length()) {
			c++;
			start = s.indexOf(stofind, start) +stofind.length();
			}
		System.out.println(stofind + "��" + s + "���ֵĴ���Ϊ" + c);
  //5.��������������������
		
			Calendar ca = Calendar.getInstance();	//��ȡCalendar.getInstance()����ca
			  ca.set(1997, 8, 9,17, 50, 30);
       // System.out.print(ca.set(2019, 8, 9,17, 50, 30)); 

	
		
		ca.getTimeInMillis();
		 int day= (int)ca.getTimeInMillis() /1000/60/60/24/345;
		// System.out.println(day);
  //6.��ȡ��������ʱ��  
		 Calendar calendar = new GregorianCalendar();//����Canlendar �����calendar
		 calendar.add(calendar.DATE, -1);//������ڵ�ǰһ��
		 Date d2=calendar.getTime();
		 SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd");//��ʽת��
		 String ZUOTIAN=sp.format(d2);
	   System.out.println(ZUOTIAN);
  //7.��λ��������ݶ����ж����죿
		 
	}

}