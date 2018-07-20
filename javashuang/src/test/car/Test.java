package test.car;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicles v = new Vehicles("abc", "red");
		v.showInfo();
		v.run();

		Car c = new Car("def", "blue", 5);
		c.showCar();
		c.run();

		Truck t = new Truck("ghi", "black", 6.5f);
		t.showTruck();
		t.run();

		Vehicles v1 = new Vehicles();
		v1.setBrand("jkl");
		v1.setColor("green");
		v1.showInfo();
		v1.run();

		Car c1 = new Car();
		c1.setBrand("mno");
		c1.setColor("yellow");
		c1.setSeats(4);
		c1.showCar();
		c1.run();

		Truck t1 = new Truck();
		t1.setBrand("pqr");
		t1.setColor("orange");
		t1.setLoad(7.7f);
		t1.showTruck();
		t1.run();

	}

}
