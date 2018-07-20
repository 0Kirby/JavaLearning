package four;

import java.util.Scanner;

public class TestDemo extends Prime{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime prime = new TestDemo();
		prime.compare();
		
	}

	@Override
	public void compare() {
		// TODO Auto-generated method stub
		System.out.println("请输入一个整数！");
		Scanner sc = new Scanner(System.in);
		super.num = sc.nextInt();
		System.out.print(num+"=");
		sc.close();
		for(i=2;i<num;i++)
			while(num%i==0){
				num/=i;
				System.out.print(i + "*");
			}
		System.out.print(num);

	}

}
