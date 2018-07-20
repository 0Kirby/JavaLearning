package cn.edu.xyc.www;

public class FlowerNumber {

	/**
	 * @param args
	 * 【练习题一】
		编写Java程序，计算100~999之间的全部“水仙花数”的平均值。
		所谓“水仙花数”是指一个三位数，
		其各位数字的立方和等于该数本身。
		例如：153=1^3+5^3+3^3，故153是水仙花数。c
	 */
	public static void main(String[] args) {

		//定义该数的百位、十位、个位和该数
		int num=100,b=0,s=0,g=0,count=0;
		float sum=0,average;

		while(num>=100&&num<=999)			
	
		{
			//分别得到十位百位和个位的值 153=1*100+5*10+3
			//s=(num-b*100)/10; 
			//g=num-b*100-s*1000; 	
			b=num/100;
			s=num%100/10;
			g=num%10; 
			
			if(num==b*b*b+s*s*s+g*g*g){	
				System.out.print(num+"\n");		
				sum+=num;//sum=sum+num;		
				count++;
			}				
			num++;
		}
		
		average=sum/count;
		System.out.print(average);
	}
}
