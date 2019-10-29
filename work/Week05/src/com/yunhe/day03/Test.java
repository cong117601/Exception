package com.yunhe.day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\file\\b.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		byte[] b = new byte[4];// 从文件中将内容读取到数组中 依次读取 数组长度 字节数
		raf.skipBytes(7);// 跳过7个字节,即第一个人的信息
		for (int i = 0; i < b.length; i++)
			b[i] = raf.readByte();
		String name = new String(b);
		int age = raf.readInt();
		System.out.println("第二个人-->姓名:" + name + ";年龄:" + age);
		raf.seek(0);// 指针回到文件的开始

		b = new byte[3];
		for (int i = 0; i < b.length; i++) 
			b[i] = raf.readByte();
		name = new String(b);
		age = raf.readInt();
		System.out.println("第一个人-->姓名:" + name + ";年龄:"+ age);
		raf.close();	

	}

}
