package com.yunhe.day02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test3 {
	public static void a() throws MyException {
		throw new MyException("aaaa");
	}

	public static void b() throws MyRuntimeException {
		throw new MyRuntimeException("你好");
	}

	public static void main(String[] args) throws MyException {
		// a();
		LinkedList<Integer> linkedList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();

		try {
			b();
		} catch (MyRuntimeException e) {

			e.printStackTrace();
		}
	}
}
