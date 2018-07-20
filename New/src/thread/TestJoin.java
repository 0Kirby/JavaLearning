package thread;

import java.util.*;

public class TestJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int[] datas = new int[10000];
		for(int i=0;i<10000;i++) {
			datas[i] = rd.nextInt(Integer.MAX_VALUE);
		}
		Adder a = new Adder(datas);
		a.start();
		try {a.join();}
		catch(InterruptedException it){}
		System.out.println(a.total);
	}

}
