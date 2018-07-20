package staticclass;

public class Circle {
	private double radius;
	public Circle(){
		this.radius = 0;
	}
	public Circle(double r){
		this.radius=r;
	}
	public double getArea(){
		return this.radius*this.radius*Math.PI;
	}
	public  double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPerimeter(){
		return this.radius*2*Math.PI;
	}
	public void show(){
		System.out.println("�뾶RΪ��"+this.getRadius()+";\n"+"���SΪ��"+this.getArea()+";\n"+"�ܳ�CΪ��"+this.getPerimeter()+"\n");
	}
}
