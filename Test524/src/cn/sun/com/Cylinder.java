package cn.sun.com;

public class Cylinder extends Circle {
	private double high;

	public Cylinder() {
		super();
	}

	public Cylinder(double high , double radius) {
		super(radius);
		this.high = high;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}
	
	public double getVolume(){
		return super.getArea() * this.high;
	}
	
	public double getArea(){
		return 2* super.getArea() + super.getPerimeter() * this.high;
	}

	@Override
	public String toString() {
		return "Cylinder [getRadius()=" + getRadius() + ", getHigh()=" + getHigh() + ", getVolume()=" + getVolume() + ", getArea()=" + getArea()
				+"]";
	}

	
}
