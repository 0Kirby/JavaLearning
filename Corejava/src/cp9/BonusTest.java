package cp9;

import java.util.Random;

public class BonusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		Random r = new Random();
		result = r.nextDouble();
		
		if(result<0.5)
		System.out.println("���Ƚ�");
		else if(result<0.8)
			System.out.println("���Ƚ�");
		else
			System.out.println("һ�Ƚ�");
	}

}
