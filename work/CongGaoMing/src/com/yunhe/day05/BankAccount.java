package com.yunhe.day05;

public class BankAccount {
	String name;// ��ʵ����
	String idCard;// ���֤��
	String telPhone;// �ֻ���
	Double balance;// ���
	String account;// ���п���
	String passWord;// ����

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

	// ��Ǯ
	public void set(double money) {
		balance += money;
	}

	// ȡǮ
	public void get(double money) {
		balance -= money;
	}

	// ��ѯ
	public Double find(){
		return balance;
	}

	
	 

}
