package com.yunhe.day03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		// 随机访问流类
		// 语法
		// public RanciomAccessFile(String name,String mode); 构造方法 输入指定的文件路径并设置模式
		// public RandomAccessFile(File file ,String mode) 接收File类并设置r只读、w只写、rw为读写模式
		RandomAccessFile raf = new RandomAccessFile("D:/file/1.txt", "rw");
//		public final byte readByte ()		从文件中读取一个字节 
		 raf.readByte();
		byte readB = raf.readByte();
		System.out.println(readB);
//		public int read (byte [] b)		从文件中将内容读取到byte数组中依次读数组长度字节数
		 byte[] b=new byte[9];
		int readL = raf.read(b);//返回读取的长度
		System.out.println(readL);
//		public final void writeBytes (String s)		按字节序列将该字符串写入该文件
		raf.writeBytes("hello! yunhe!");
//		public final void writeInt(int v)		按四个字节将int写入该文件
		raf.writeInt(123);
//		public void seek(long pos)		设置指针距离文件开头的字节数，是绝对定位
		 raf.seek(32);
		 raf.writeBytes("aaa");
//	    public int skipBytes (int n)	指针从当前位置开始跳过的字节数是相对定位
		raf.skipBytes(9);
		raf.writeBytes("!");
//		public  long getFilePointer ()	方法	获取指针的当前位置
		System.out.println(raf.getFilePointer());
//      public void close () 方法 关闭随机存取交流并释放与该流关联的所有系统资源
		raf.close();

	}

}
