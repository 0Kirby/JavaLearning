package calculator;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number number =new Number();
		number.setN1(4);
		number.setN2(2);
		System.out.println(number.toString());
	
		Number number2 = new Number(8,4);
		System.out.println(number2.toString());
		
	}

}
