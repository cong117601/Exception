package com.yunhe.day03;

import java.io.File;
import java.io.IOException;

//创建一个文件，存在删除，不存在创建 ，输出文件大小 
public class Ftest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File f =new File("D:/f");
     if(f.exists()) {
    	f.delete(); 
     }else {
    	 f.createNewFile();
     }
     System.out.println("文件名称:" + f.getName());
     System.out.println("文件路径:" + f.getPath());
     System.out.println("文件长度:" + f.length() + "Bytes");
     System.out.println(f.isDirectory() ? "是目录" : "不是目录");
	}

}
