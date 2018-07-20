package cn.edu.xyc.www;

public class PolymorphismDemo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes obj = new Shapes();  //父类的引用指向父类的实例
	    obj.draw();                 //调用绘图方法
	    obj = new Circle();         //父类的引用指向子类的实例
	    obj.draw();                 //调用绘图方法
	    obj = new Square();         //父类的引用指向子类的实例
	    obj.draw();                 
	}

}
