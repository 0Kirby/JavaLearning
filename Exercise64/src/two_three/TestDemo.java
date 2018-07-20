package two_three;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Bus();
		car.setBrand("zhongda");
		System.out.println(car.toString());
		System.out.println(car instanceof Bus);
		System.out.println(car instanceof Bicycle);
		System.out.println(car instanceof Car);
		
		Car car2 = new Bicycle();
		car2.setBrand("yongjiu");
		System.out.println(car2.toString());
		
	}

}
