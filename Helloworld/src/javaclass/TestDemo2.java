package javaclass;

public class TestDemo2 {
	public static void main(String args[]){
		Dog dogA=new Dog();
		dogA.setName("dog");
		dogA.setColour("brown");
		dogA.setAge(5);
		System.out.println(dogA.getInfo());
		Dog dogB=new Dog("cat","yellow",6);
		System.out.println(dogB.getInfo());
	}
}
