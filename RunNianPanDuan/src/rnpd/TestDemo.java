package rnpd;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("��ӭʹ�ñ����򣡱���������ж��û����������Ƿ�Ϊ���꣡\n��������ݣ�");
	 Scanner sc = new Scanner(System.in);
	 int Year=sc.nextInt();
	 Judgement a =new Judgement(Year);
	 a.panduan();
	 sc.close();
	}
}