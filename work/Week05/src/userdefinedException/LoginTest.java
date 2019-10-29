package userdefinedException;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		System.out.println("�������û�id:");
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		System.out.println("���������룺");
		String pasword = sc.nextLine();
		UserSever users=new UserSever();
		try {
			User user=users.login(id, pasword);
			System.out.println("��½�ɹ�");
			System.out.println(user);
		} catch (MyException e) {
		
			e.printStackTrace();
		}

	}

}
