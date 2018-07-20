package utilLearning;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
	    for (int i = 0; i < 20; i++)
	    {
	    	int num = rand.nextInt();
	    	System.out.println("第" + (i + 1) + "个随机数是：" + num);
	    }
	}

}
