package cn.edu.xyc.www;

import java.util.Scanner;

public class Oct_Bin {

	/**
	 * @param args
	 * ʮ����תΪ������
	 */
	public static void main(String[] args) {
		
		//�Ӽ��̽���N��ֵ
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int r,i=0;
		
		int x[]=new int[5];
		
		//���϶�2����
		while(true){
			if(N!=0){
				r=N%2;//����
				
				N=N/2;//����
				
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
