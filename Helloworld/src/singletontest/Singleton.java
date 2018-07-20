package singletontest;

public class Singleton {
	private final static Singleton ab=new Singleton();
	private Singleton(){
	}
	public static Singleton getAb() {
		return ab;
	}
	public void print(){
		System.out.println("I am a single!");
	}
}
