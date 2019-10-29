package com.yunhe.day03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdIO {
public static void main(String[] args) throws Exception {
	out();
	in();
}
public static void out() throws IOException {
	File f =new File("D:\\file\\2.txt");
	FileOutputStream fps =new FileOutputStream(f);
	BufferedOutputStream bps =new BufferedOutputStream(fps);
	String s ="这是啥意思";
	bps.write(s.getBytes());
	bps.flush();
	fps.flush();
	bps.close();
	fps.close();
}
public static void in() throws Exception {
	File f = new File("D:/file/2.txt");
	FileInputStream fis = new FileInputStream(f);
	BufferedInputStream bis = new BufferedInputStream(fis);
	byte[] b = new byte[2];
	while (bis.read(b) != -1) {
		System.out.print(new String(b));
	}
	bis.close();
	fis.close();
}

}
