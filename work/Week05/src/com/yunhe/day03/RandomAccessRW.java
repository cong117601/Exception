package com.yunhe.day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessRW {
public static void main(String[] args) throws IOException {
   	File file =new File("D:\\file\\b.txt");
   	RandomAccessFile raf =new RandomAccessFile(file, "rw");
   	  // –¥»Î–≈œ¢
   	String name="tom";
   	int age=18;
   	raf.writeBytes(name);
   	raf.writeInt(age);
   	String name1="jos";
   	int age1=20;
   	raf.writeBytes(name1);
   	raf.writeInt(age1);
   	raf.close();
   	
   	raf.close();
   	
   	
}
}
