package cn.edu.xyc.www;

class Shapes {  //基本形状类
	  public void draw() {  //绘图的方法
	    System.out.println("绘制了一个基本形状。");
	  }
	}

	class Circle extends Shapes {  //圆形类继承于基本形状类
	  public void draw() {  //覆盖父类的绘图方法
	    System.out.println("绘制了一个圆形。");
	  }
	} 

	class Square extends Shapes {  //正方形类继承与基本形状类
	  public void draw() {  //覆盖父类的绘图方法
	    System.out.println("绘制了一个正方形。");
	  }
	}
