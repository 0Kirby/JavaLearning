package traffic;

public class Vehicle {
	private int speed;
	private String color;
	public Vehicle() {
		
	}
	public Vehicle(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String move(){
		return "��ͨ���߿�ʼ�ƶ��ˣ�";
	}
	
	public void speedUp(int speed){
		this.speed += speed;
	}
	
	public void speedDown(int speed){
		this.speed -= speed;
	}

	public String show() {
		return "Vehicle [move()=" + move() + ", speed=" + speed + ", color=" + color + "]";
	}
	
	
	
}
