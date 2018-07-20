package cn.edu.xyc.www;

import java.util.Scanner;

public class Temperature {

	/*
	 * 从键盘不断输入一个温度值 然后判断该温度值<=10,还是>=40,还是介于20到30之间； 如果温度值<=10，输出“好冷”
	 * 如果温度值>=40，输出“好热” 如果温度值介于20到30之间，输出“好舒服" 如果输入99,程序结束运行。
	 * 
	 **/

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {

			int a = sc.nextInt();

			if (a >= 40 && a != 99)
				System.out.println("好热");
			if (a <= 10)
				System.out.println("好冷");
			if (a >= 20 && a <= 30)
				System.out.println("好舒服");

			if (a == 99)
				break;

		}

	}
}
