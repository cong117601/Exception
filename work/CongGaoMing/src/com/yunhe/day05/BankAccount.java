package com.yunhe.day05;

public class BankAccount {
	String name;// 真实姓名
	String idCard;// 身份证号
	String telPhone;// 手机号
	Double balance;// 余额
	String account;// 银行卡号
	String passWord;// 密码

	public BankAccount() {
	}

	public BankAccount(String name, String idCard, String telPhone,Double balance, String account, String passWord) {
		this.name = name;
		this.idCard = idCard;
		this.telPhone = telPhone;
		this.balance = balance;
		this.account = account;
		this.passWord = passWord;
	}

	// 存钱
	public void set(double money) {
		balance += money;
	}

	// 取钱
	public void get(double money) {
		balance -= money;
	}

	// 查询
	public Double find(){
		return balance;
	}

	
	 

}
