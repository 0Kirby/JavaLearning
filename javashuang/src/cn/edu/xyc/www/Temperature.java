package cn.edu.xyc.www;

import java.util.Scanner;

public class Temperature {

	/*
	 * �Ӽ��̲�������һ���¶�ֵ Ȼ���жϸ��¶�ֵ<=10,����>=40,���ǽ���20��30֮�䣻 ����¶�ֵ<=10����������䡱
	 * ����¶�ֵ>=40����������ȡ� ����¶�ֵ����20��30֮�䣬����������" �������99,����������С�
	 * 
	 **/

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {

			int a = sc.nextInt();

			if (a >= 40 && a != 99)
				System.out.println("����");
			if (a <= 10)
				System.out.println("����");
			if (a >= 20 && a <= 30)
				System.out.println("�����");

			if (a == 99)
				break;

		}

	}
}
