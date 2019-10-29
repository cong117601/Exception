package com.yunhe.day01;

public class Test {

	public static void main(String[] args) {
		ImportCosmeticManger cm = new ImportCosmeticManger();
		cm.add(new Cosmetic("香奈儿", "进口", 1000));
		cm.add(new Cosmetic("圣罗兰", "进口", 11100));
		cm.add(new Cosmetic("大宝", "国产", 20));
		cm.add(new Cosmetic("万紫千红", "国产", 15));
		cm.printInfo();
	}

}
