package cn.edu.xyc.www;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary1 = {2, 4, 6, 8, 10};  //��������ʼ������1
	    int[] ary2;   //��������2
	    ary2 = ary1;  //������1��ֵ������2
	    
	    ary2[3] = 1024;  //ͨ������2�޸�����һ��Ԫ�ص�ֵ
	    
	    //��ӡ������1�е�Ԫ��
	    System.out.println("����1�е�Ԫ�أ�");
	    for (int i = 0; i < ary1.length; i++) {
	      System.out.println(ary1[i]);
	    }
	    
	    //��ӡ������2�е�Ԫ��
	    System.out.println("����2�е�Ԫ�أ�");
	    for (int i = 0; i < ary2.length; i++) {
	      System.out.println(ary2[i]);

	    }
	}
}
