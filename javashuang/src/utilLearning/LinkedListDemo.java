package utilLearning;

import java.util.LinkedList;

public class LinkedListDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Double> ll = new LinkedList<Double> ();
		for (int i = 1; i <= 10; i++) {
		      Double temp = new Double(Math.sqrt(i));  
		      ll.add(temp);
		      }
		//System.out.println(ll.toString());
		System.out.println("�����е�Ԫ�أ�");
	    for (int i = 0; i < ll.size(); i++) {
	      System.out.println(ll.get(i));
	    }
	    ll.removeFirst();
	    ll.removeLast();
		System.out.println("ɾ����һ��Ԫ�غ����һ��Ԫ�غ������");
	    for (int i = 0; i < ll.size(); i++) {
	      System.out.println(ll.get(i));
	    }
	}

}
