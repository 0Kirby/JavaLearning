package cn.edu.xyc.www;

public class Add {

	public int add(int x,int y) {
		return x+y;
	}
	
	public float add(float x,float y) {
		return x+y;
	}
	
	public String add(String x,String y) {
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add a=new Add();
		int A=a.add(1,2);
		System.out.println("1+2="+A);
		
		Add b=new Add();
		float B=b.add(1.3f,2.6f);
		System.out.println("1.3+2.6="+B);
		
		Add c=new Add();
		String C=c.add("abc","def");
		System.out.println("abc+def="+C);
		
	}

}
