package cn.sun.com;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle  = new Circle();
		circle.setRadius(2.0);
		System.out.println(circle.toString());
		
		Circle circle2 = new Circle(3.0);
		System.out.println(circle2.toString());
		
		Cylinder cylinder = new Cylinder();
		cylinder.setRadius(2.0);
		cylinder.setHigh(3.0);
		System.out.println(cylinder.toString());
		
		Cylinder cylinder2 = new Cylinder(2.0,3.0);
		System.out.println(cylinder2.toString());
		
		Singleton abc= Singleton.getaaa();
		abc.print();
	}

}
