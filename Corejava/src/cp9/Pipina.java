package cp9;

import java.util.Scanner;

public class Pipina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, x, y;
		int z;
		System.out.println("������������������������һ�������");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();
		do {
			a = x % 100;
			b = y % 100;
			x = (x - a) * 6 / 5 * 0.95 + a;
			y = (y - b) * 6 / 5 * 0.95 + b;
			z--;
			System.out.println(x + "," + y);
		} while (z > 0);
	}

}
