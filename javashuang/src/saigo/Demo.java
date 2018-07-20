package saigo;

public class Demo {

	/**包装类
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Integer inte=new Integer(100);//对象
		int inte_2=100;//变量
		if(inte.intValue()==inte_2){
			System.out.println("value equal");
		}
		Integer newValue=Integer.valueOf(inte);
		System.out.println(newValue);
		
		String s="1230";
		//将字符串转换为对应的整数对象（值）
		Integer secondValue=Integer.valueOf(s);
		//将字符串转换为对应的值
		int a=Integer.parseInt(s);
		System.out.println(a);
		
		if(secondValue==1230)
		System.out.println(secondValue);
		
		
	}

}
