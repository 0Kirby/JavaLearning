package cn.edu.xyc.www;

import java.util.Scanner;

public class Points {

	/**
	 * @param args
	 * 【练习题三】
		完成学员成绩的统计。
		要求学员的成绩从命令行输入，数量不限，
		在程序中接受这些成绩，保存到一个数组中，
		然后将这些成绩进行降序排序，最后求出平均成绩，
		打印出来。
	 * 
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int i=0,N;
		N=sc.nextInt();
		int grades[] =new int[N];
		
		//从键盘接受成绩，然后存入数组
		while(true){
			int points=sc.nextInt();
			grades[i]=points;
			i++;
			N--;
			if(N==0)break;
		}
		
		int t,sum = 0;
		float average;
		
		//数组的从高到低排序(冒泡排序）。
		//如果数组的后一个数大于前一个数，就交换他们的位置
		for(int k=0;k<grades.length-1;k++){
			for(int l=0;l<grades.length-1-k;l++){
			if(grades[l+1]>grades[l]){
				t=grades[l+1];
				grades[l+1]=grades[l];
				grades[l]=t;
			}	
		}
	}
		
		
		//对数组元素进行求和
		for(int j=0;j<grades.length;j++){
			sum+=grades[j];
		System.out.print(grades[j]+" ");
		}
		
		//求数组元素的平均值
		average=sum/grades.length;
		System.out.print(average);
		
		}   
	}
