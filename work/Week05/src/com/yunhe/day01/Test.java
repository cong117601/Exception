package com.yunhe.day01;

public class Test {

	public static void main(String[] args) {
		ImportCosmeticManger cm = new ImportCosmeticManger();
		cm.add(new Cosmetic("���ζ�", "����", 1000));
		cm.add(new Cosmetic("ʥ����", "����", 11100));
		cm.add(new Cosmetic("��", "����", 20));
		cm.add(new Cosmetic("����ǧ��", "����", 15));
		cm.printInfo();
	}

}
