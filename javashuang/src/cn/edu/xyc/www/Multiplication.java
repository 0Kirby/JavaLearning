package cn.edu.xyc.www;

public class Multiplication {

	/**
	 * @param args
	 * @author 季天宇
	 * @version 1.0
	 */
	public static void main(String[] args) {

		for(int i=1;i<=9;i++){//控制行號
			
			for(int j=1;j<=i;j++){//控制列號
				//1*1=1，  i*j=i*j;
				System.out.print(j+"*"+i+"="+i*j+",\t");
				if(i==j)
					System.out.println();
			}
			
		}
		
		
	}

}
