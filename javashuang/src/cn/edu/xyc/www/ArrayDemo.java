package cn.edu.xyc.www;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary1 = {2, 4, 6, 8, 10};  //声明并初始化数组1
	    int[] ary2;   //声明数组2
	    ary2 = ary1;  //将数组1赋值给数组2
	    
	    ary2[3] = 1024;  //通过数组2修改其中一个元素的值
	    
	    //打印出数组1中的元素
	    System.out.println("数组1中的元素：");
	    for (int i = 0; i < ary1.length; i++) {
	      System.out.println(ary1[i]);
	    }
	    
	    //打印出数组2中的元素
	    System.out.println("数组2中的元素：");
	    for (int i = 0; i < ary2.length; i++) {
	      System.out.println(ary2[i]);

	    }
	}
}
