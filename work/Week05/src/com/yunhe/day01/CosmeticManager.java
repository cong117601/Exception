package com.yunhe.day01;

public class CosmeticManager { //��ױƷ������
  protected Cosmetic[] cs =new Cosmetic[4];
  protected int count=0;
  //��������
  public void add(Cosmetic c) {
	  int size=cs.length;
	  if(count>=size) {
		  int newLen=size*2;
		  cs=java.util.Arrays.copyOf(cs, newLen);
	  }
	  cs[count]=c;
	  count++;
  }
  //������в�Ʒ
  public void printInfo() {
	  for(int i=0;i<count;i++) {
		  System.out.println(cs[i].getInfo());
	  }
	  
  }
  
  
  
  
  
}
