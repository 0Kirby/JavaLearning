package com.test.tencentapi.scf;

public class U0027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc"+"\\u0027"+"\\\"";
		System.out.println(s);
		String t = "\\\\u0027";
		System.out.println(t);
		String s1=s.replaceAll(t,"12345");
		s1=s1.replaceAll("\\\\\"","67890");
		System.out.println(s1);
	}

}
