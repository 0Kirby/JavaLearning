package utilLearning;

import java.util.ArrayList;

public class ArrayListDemo1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
		      Integer num = new Integer(i);    
		      al.add(num);                     
		    }

		System.out.println("数组中的元素：");
	    for (int i = 0; i < al.size(); i++) {
	      Integer temp = (Integer)(al.get(i));
	      System.out.println(temp);
	    }
	    System.out.println("*********************************");
	    al.clear();  //清空
	    System.out.println("数组被清空后的情况：");
	    System.out.println("数组长度为：" + al.size());
	    if (al.isEmpty()) {    //判断是否为空
	      System.out.println("数组现在为空。");
	    }
	    else {
	      System.out.println("数组现在不为空。");
	    }

	}

}
