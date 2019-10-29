package com.yunhe.day03;

import java.io.File;
import java.io.IOException;

public class FileTest {
public static void main(String[] args) throws IOException {
	//public File(String filename);  构造方法创建File类对象 并传入完整路径
	File file =new File("D:/file/aa/bb");//使用指定路径创建文件夹 
	System.out.println(File.separator);//File.separator  常量 文件路径分隔符
     //file.mkdir();//创建单级目录   只能创建单级目录  当不存在时进行创建
	file.mkdirs();//创建多级目录 
	//public boolean idDirectory();
	System.out.println(file.isDirectory());//判断给定路径是否为目录
	//file.delete();//删除目录 或文件  只能删除指定文件 或没有文件夹的目录
	//public renameTo(File dest); 重命名文件或目录  也可移动文件 
	//File file1 =new File("D:/file/aa/1.test");
	//file.renameTo(file1);
	//file.renameTo(new File("D:/file/aa/1.test"));与上面的一样   重名名时应先创建一个新的文件对象 
	//public File[] listFiles(); //列出 指定目录的全部文件
	  File[] listFiles =file.listFiles();
	  for (File file2 : listFiles) {
		System.out.println(file2.getName());
	}
	
	  //public String[] list()	//列出指定目录下的子目录及其文件
	  String[] list = new File("D:/file").list();
	for (String string : list) {
		System.out.println(string);   
	}
	//public boolean creatNewFile();创建新的文件   只能在已有的文件夹中创建 
	File file2 = new File("D:/file/b.txt");
		file2.createNewFile();
    //public boolean delect(); 删除文件 或 目录  只能先删除文件再删除目录
	   // file2.delete();	
//		public boolean exists()	方法	判断文件是否存在
	   if(file2.exists()) {      
		   System.out.println("cnm");
	   }else{
		   System.out.println("cndy");
	   };
//		public long length()	方法	返回文件的大小
	  System.out.println(file2.length());
//		public String getPath()	方法	返回文件的路径信息  
	  System.out.println(file2.getPath());//D:\file\b.txt
	  System.out.println(file2.toURI());//file:/D:/file/b.txt
	  
	  
}
}