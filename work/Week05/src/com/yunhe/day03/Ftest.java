package com.yunhe.day03;

import java.io.File;
import java.io.IOException;

//����һ���ļ�������ɾ���������ڴ��� ������ļ���С 
public class Ftest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File f =new File("D:/f");
     if(f.exists()) {
    	f.delete(); 
     }else {
    	 f.createNewFile();
     }
     System.out.println("�ļ�����:" + f.getName());
     System.out.println("�ļ�·��:" + f.getPath());
     System.out.println("�ļ�����:" + f.length() + "Bytes");
     System.out.println(f.isDirectory() ? "��Ŀ¼" : "����Ŀ¼");
	}

}
