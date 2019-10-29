package com.yunhe.day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) throws IOException {
		// out();
		in();
	}

	public static void out() throws IOException {

		File f = new File("D:\\file\\2.txt");
		FileOutputStream fps = new FileOutputStream(f, true);// true是直接在末尾追加 继续写内容 ，false是覆盖
		String s = "学习使我快乐，不学习难受";
		fps.write(s.getBytes());
		fps.close();
	}

	public static void in() throws IOException {
		File f = new File("D:\\file\\2.txt");
		FileInputStream fps = new FileInputStream(f);
		byte[] b = new byte[2];
//		char a[] = { 'A', 'b', 'c', 'E' };
//		String str1 = new String(a);
//		System.out.println(str1);

		while (fps.read(b) != -1) {
			System.out.print(new String(b));
		}
		fps.close();
	}

}
