package com.yunhe.day05;

import java.util.Scanner;

public class ATM {
	// �Զ���ȡ�����

	static BankAccount a = new BankAccount("����", "2354199902021254", "13xxxxxxxxxxx", 100.00, "10010", "10086");

		// �������� ������=ֵ��
		// ������������ ����

		// �忨 =�������˺� =������account

		// ���ڶ�ȡ��Ϣ=�����

		// ��������=������̨����password

		// �ж� �˺������Ƕ�ƥ��

		// ƥ��=����ѡ�� 0-��ѯ��� 1-��Ǯ 2-ȡǮ 3-�˳�

		// ��ѯ���
		public void find() {
			System.out.println("���Ϊ��" + a.find());
		}

		// ��Ǯ
		public void set(double money) {
			a.get(money);
		}

		// ȡǮ
		public void get(double money) {
			if (money <= a.find()) {
				a.get(money);
			} else {
				System.out.println("����");
			}
		}
		
		//��ӭ����
		public void welcom(){
			System.out.println("��ӭʹ��XX�����Զ���ȡ���");
			System.out.println("�����ʱע���ܱ߰�ȫ");
		}
		
		//�жϷ���  ��֪�˺����� �Ƿ�ƥ��
		public boolean login(String account ,String passWord){
			if (account.equals(a.account) && passWord.equals(a.passWord)) {
				return true;
			}else{
				return false;
			}
		}
		
		//��ǰatm�汾ִ��
		public void start(){
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.println("�����������˺�");
				String account = scanner.nextLine();
				System.out.println("����������");
				String passWord = scanner.nextLine();
				String aAccount = a.account;// ��ǰ�˺�
				String pPassWord = a.passWord;// ��ǰ����
				if (login(aAccount, pPassWord)) {
					while (true) {
						System.out.println("��ѡ�� 0-��ѯ���  1-��Ǯ 2-ȡǮ 3-�˳�");
						int choose = scanner.nextInt();
						if (choose == 0) {
							find();
						} else if (choose == 1) {
							System.out.println("����������");
							set(scanner.nextDouble());
							find();
						} else if (choose == 2) {
							System.out.println("������ȥȡ����");
							get(scanner.nextDouble());
							find();
						} else {
							break;
						}
					}
				} else {
					System.out.println("�������,����������");
				}
			}
		}
		public static void main(String[] args) {
			ATM atm=new ATM();
			atm.start();
		}

}
