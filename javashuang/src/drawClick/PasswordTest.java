package drawClick;

import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pw = new String();
		System.out.println("������֧�����룺");
		Scanner sc = new Scanner(System.in);
		pw = sc.nextLine();

		System.out.println("������֧�����룺");
		if (pw.equals(sc.nextLine())) {
			System.out.println("֧���ɹ�!");
		} else {
			System.out.println("�������");
		}
		
		sc.close();
	}

}
