package com.yunhe.day01;

 class SortCosmeticManger extends CosmeticManager {
 // ��д   �ɰ���������Ĺ�����
	@Override
	public void printInfo() {
	Cosmetic[] temp=java.util.Arrays.copyOf(cs, count);
	//System.out.println(temp.length);
	//ð������
	Cosmetic c=null;
   for(int i=0;i<temp.length;i++) {
	   for(int j=0;j<temp.length-i-1;j++) {
		   if(temp[j].getPrice()>temp[j+1].getPrice()) {
			   c=temp[j];
			   temp[j]=temp[j+1];
			   temp[j+1]=c;
			   
		   }
		   
	   }
	   
   }
   for (Cosmetic cosmetic : temp) {
	 System.out.println(cosmetic.getInfo());
}
	}
}
