package cn.edu.xyc.www;

import java.util.Scanner;

public class EnumUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
		String input = sc.next().toUpperCase();
		EnumTest et = EnumTest.valueOf(EnumTest.class, input);
		System.out.println("Size="+et);
		System.out.println("Measure="+et.Get());
		sc.close();
		System.out.println(Double.POSITIVE_INFINITY);
	}

}
