package cn.edu.xyc.www;

public class Multiplication {

	/**
	 * @param args
	 * @author ������
	 * @version 1.0
	 */
	public static void main(String[] args) {

		for(int i=1;i<=9;i++){//������̖
			
			for(int j=1;j<=i;j++){//������̖
				//1*1=1��  i*j=i*j;
				System.out.print(j+"*"+i+"="+i*j+",\t");
				if(i==j)
					System.out.println();
			}
			
		}
		
		
	}

}