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
		byte[] b = new byte[4];// ���ļ��н����ݶ�ȡ�������� ���ζ�ȡ ���鳤�� �ֽ���
		raf.skipBytes(7);// ����7���ֽ�,����һ���˵���Ϣ
		for (int i = 0; i < b.length; i++)
			b[i] = raf.readByte();
		String name = new String(b);
		int age = raf.readInt();
		System.out.println("�ڶ�����-->����:" + name + ";����:" + age);
		raf.seek(0);// ָ��ص��ļ��Ŀ�ʼ

		b = new byte[3];
		for (int i = 0; i < b.length; i++) 
			b[i] = raf.readByte();
		name = new String(b);
		age = raf.readInt();
		System.out.println("��һ����-->����:" + name + ";����:"+ age);
		raf.close();	

	}

}
