package cn.sun.com;

public class Singleton {
	private final static Singleton aaa = new Singleton();
	
	private Singleton(){
		
	}

	public static Singleton getaaa() {
		return aaa;
	}
	
	public void print(){
		System.out.println("abcdefg");
	}
}
