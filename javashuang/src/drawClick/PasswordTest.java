package drawClick;

import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pw = new String();
		System.out.println("ÇëÉèÖÃÖ§¸¶ÃÜÂë£º");
		Scanner sc = new Scanner(System.in);
		pw = sc.nextLine();

		System.out.println("ÇëÊäÈëÖ§¸¶ÃÜÂë£º");
		if (pw.equals(sc.nextLine())) {
			System.out.println("Ö§¸¶³É¹¦!");
		} else {
			System.out.println("ÃÜÂë´íÎó£¡");
		}
		
		sc.close();
	}

}
