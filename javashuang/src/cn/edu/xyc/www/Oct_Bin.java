package cn.edu.xyc.www;

import java.util.Scanner;

public class Oct_Bin {

	/**
	 * @param args
	 * 十进制转为二进制
	 */
	public static void main(String[] args) {
		
		//从键盘接受N的值
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int r,i=0;
		
		int x[]=new int[5];
		
		//不断对2求余
		while(true){
			if(N!=0){
				r=N%2;//求余
				
				N=N/2;//求商
				
				//System.out.print(r);
				
				x[i]=r;
				
				i++;
				
			}
			else
				break;
		}
		
		for(int k=x.length-1;k>=0;k--){
			System.out.print(x[k]);
		}
		
		
		
	}

}
