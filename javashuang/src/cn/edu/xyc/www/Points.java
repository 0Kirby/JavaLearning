package cn.edu.xyc.www;

import java.util.Scanner;

public class Points {

	/**
	 * @param args
	 * ����ϰ������
		���ѧԱ�ɼ���ͳ�ơ�
		Ҫ��ѧԱ�ĳɼ������������룬�������ޣ�
		�ڳ����н�����Щ�ɼ������浽һ�������У�
		Ȼ����Щ�ɼ����н�������������ƽ���ɼ���
		��ӡ������
	 * 
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int i=0,N;
		N=sc.nextInt();
		int grades[] =new int[N];
		
		//�Ӽ��̽��ܳɼ���Ȼ���������
		while(true){
			int points=sc.nextInt();
			grades[i]=points;
			i++;
			N--;
			if(N==0)break;
		}
		
		int t,sum = 0;
		float average;
		
		//����ĴӸߵ�������(ð�����򣩡�
		//�������ĺ�һ��������ǰһ�������ͽ������ǵ�λ��
		for(int k=0;k<grades.length-1;k++){
			for(int l=0;l<grades.length-1-k;l++){
			if(grades[l+1]>grades[l]){
				t=grades[l+1];
				grades[l+1]=grades[l];
				grades[l]=t;
			}	
		}
	}
		
		
		//������Ԫ�ؽ������
		for(int j=0;j<grades.length;j++){
			sum+=grades[j];
		System.out.print(grades[j]+" ");
		}
		
		//������Ԫ�ص�ƽ��ֵ
		average=sum/grades.length;
		System.out.print(average);
		
		}   
	}