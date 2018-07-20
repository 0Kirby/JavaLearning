package iolearning;

import java.io.*;

public class ConsoleInputDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("请输入您的姓名：");
		String name = br.readLine();
	    System.out.println("请输入您的年龄：");
	    int age = Integer.parseInt(br.readLine());
	    System.out.println("您的姓名：" + name);
	    System.out.println("您的年龄：" + age);
	    br.close();
	    isr.close();
	}

}
