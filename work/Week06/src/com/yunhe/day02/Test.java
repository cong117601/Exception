package com.yunhe.day02;

import java.util.Arrays;

public class Test {
	static {
		System.out.println("你好小b");// 静态代码块 只执行一次；
	}

	public static void eat() {
		System.out.println("nichi si ");
	}

	public static void main(String[] args) {
		String s = "sAAAsd";
		char charAt = s.charAt(1);
		int indexOf = s.indexOf("d", 3);
		String lowerCase = s.toLowerCase();
		s.toUpperCase();
		System.out.println(lowerCase);
		System.out.println(s.indexOf(3, 0));
		System.out.println(indexOf);
		System.out.println(charAt);
		Test t = new Test();
		Test t1 = new Test();
		t.eat();
		t1.eat();
		int[] a = { 3, 2, 2, 1, 8 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] < a[j + 1]) {
					int b = a[j + 1];
					a[j + 1] = a[j];
					a[j] = b;
				}
			}

		}
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(a));
	}
}
