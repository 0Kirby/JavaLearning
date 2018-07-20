package array1;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{1,2,3,4,5,6};
		for(int i=1;i<a.length;i++){
				System.out.print(a[a.length-i]+",");
		}
		System.out.print(a[0]);
		
		System.out.println();
		
//ÅÅÐò	
		
		int b[] = new int[]{1,6,4,3,2,5};
		java.util.Arrays.sort(b);
		for(int j=0;j<b.length-1;j++){
			System.out.print(b[j]+",");
	}
	System.out.print(b[b.length-1]);
		
	System.out.println();
	
//¿½±´
		int c[] = new int[]{4,5,1,6,2,3};
		System.arraycopy( a , 1 , c , 3 , 2 );
		
		for(int k=0;k<c.length-1;k++){
			System.out.print(c[k]+",");
	}
	System.out.print(c[c.length-1]);
	
	}
}
