package rnpd;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("欢迎使用本程序！本程序可以判断用户输入的年份是否为闰年！\n请输入年份！");
	 Scanner sc = new Scanner(System.in);
	 int Year=sc.nextInt();
	 Judgement a =new Judgement(Year);
	 a.panduan();
	 sc.close();
	}
}
