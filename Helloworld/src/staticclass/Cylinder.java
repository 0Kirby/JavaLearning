package staticclass;

public class Cylinder extends Circle{
	 private double hight;
	 public Cylinder (double r, double h ){
		 super.setRadius(r);
		 this.hight=h; 
		 }
	 
		 public double getVolume(){
			 return Math.PI*this.getRadius()*this.getRadius()*this.hight;
			 }
		 public double getArea(){
			 return 2*Math.PI*this.getRadius()*this.getRadius()+2*Math.PI*this.getRadius()*this.hight;
		 }
			 public void show (){
				 System.out.println("半径R为："+this.getRadius()+";\n"+"表面积S为："+this.getArea()+";\n"+"圆周长C为："+this.getRadius()*2*Math.PI+";\n"+"体积V为："+this.getVolume()+"\n");
			 }
			 
	 }
