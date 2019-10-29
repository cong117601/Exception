package com.yunhe.day01;

public class Cosmetic {
	// 化妆品类
	private String name;// 姓名
	private String type;// 类型 进口 国产
	private double price;// 价钱

	public Cosmetic() {

	}

	// 构造方法
	public Cosmetic(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInfo() {

		return "name=" + name + ",type=" + type + ",price=" + price;
	}

}
