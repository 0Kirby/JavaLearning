package classqwe;


public class TestDemo {
public static void main(String args[])
{
Person perA= new Person();
System.out.println(perA);
perA.print();
	}
}
class Person {
//private String name;
//private int age;

public Person()
{
	System.out.println("*** 一个Person类被实例化。");
}

public void print()
{
	System.out.println("当前对象：" + this);
}
}

