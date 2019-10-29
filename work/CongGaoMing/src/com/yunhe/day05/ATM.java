package com.yunhe.day05;

import java.util.Scanner;

public class ATM {
	// 自动存取款机器

	static BankAccount a = new BankAccount("张三", "2354199902021254", "13xxxxxxxxxxx", 100.00, "10010", "10086");

		// 数据类型 属性名=值；
		// 基本数据类型 引用

		// 插卡 =》输入账号 =》输入account

		// 正在读取信息=》输出

		// 输入密码=》控制台输入password

		// 判断 账号密码是都匹配

		// 匹配=》请选择 0-查询余额 1-存钱 2-取钱 3-退出

		// 查询余额
		public void find() {
			System.out.println("余额为：" + a.find());
		}

		// 存钱
		public void set(double money) {
			a.get(money);
		}

		// 取钱
		public void get(double money) {
			if (money <= a.find()) {
				a.get(money);
			} else {
				System.out.println("余额不足");
			}
		}
		
		//欢迎方法
		public void welcom(){
			System.out.println("欢迎使用XX银行自动存取款机");
			System.out.println("请操作时注意周边安全");
		}
		
		//判断方法  已知账号密码 是否匹配
		public boolean login(String account ,String passWord){
			if (account.equals(a.account) && passWord.equals(a.passWord)) {
				return true;
			}else{
				return false;
			}
		}
		
		//当前atm版本执行
		public void start(){
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.println("请输入银行账号");
				String account = scanner.nextLine();
				System.out.println("请输入密码");
				String passWord = scanner.nextLine();
				String aAccount = a.account;// 当前账号
				String pPassWord = a.passWord;// 当前密码
				if (login(aAccount, pPassWord)) {
					while (true) {
						System.out.println("请选择 0-查询余额  1-存钱 2-取钱 3-退出");
						int choose = scanner.nextInt();
						if (choose == 0) {
							find();
						} else if (choose == 1) {
							System.out.println("请输入存款金额");
							set(scanner.nextDouble());
							find();
						} else if (choose == 2) {
							System.out.println("请输入去取款金额");
							get(scanner.nextDouble());
							find();
						} else {
							break;
						}
					}
				} else {
					System.out.println("密码错误,请重新输入");
				}
			}
		}
		public static void main(String[] args) {
			ATM atm=new ATM();
			atm.start();
		}

}
