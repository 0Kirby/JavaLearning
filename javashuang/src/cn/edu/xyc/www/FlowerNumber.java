package cn.edu.xyc.www;

public class FlowerNumber {

	/**
	 * @param args
	 * ����ϰ��һ��
		��дJava���򣬼���100~999֮���ȫ����ˮ�ɻ�������ƽ��ֵ��
		��ν��ˮ�ɻ�������ָһ����λ����
		���λ���ֵ������͵��ڸ�������
		���磺153=1^3+5^3+3^3����153��ˮ�ɻ�����c
	 */
	public static void main(String[] args) {

		//��������İ�λ��ʮλ����λ�͸���
		int num=100,b=0,s=0,g=0,count=0;
		float sum=0,average;

		while(num>=100&&num<=999)			
	
		{
			//�ֱ�õ�ʮλ��λ�͸�λ��ֵ 153=1*100+5*10+3
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
