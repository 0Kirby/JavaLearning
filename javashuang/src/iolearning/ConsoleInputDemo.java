package iolearning;

import java.io.*;

public class ConsoleInputDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("����������������");
		String name = br.readLine();
	    System.out.println("�������������䣺");
	    int age = Integer.parseInt(br.readLine());
	    System.out.println("����������" + name);
	    System.out.println("�������䣺" + age);
	    br.close();
	    isr.close();
	}

}
