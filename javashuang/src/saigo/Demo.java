package saigo;

public class Demo {

	/**��װ��
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Integer inte=new Integer(100);//����
		int inte_2=100;//����
		if(inte.intValue()==inte_2){
			System.out.println("value equal");
		}
		Integer newValue=Integer.valueOf(inte);
		System.out.println(newValue);
		
		String s="1230";
		//���ַ���ת��Ϊ��Ӧ����������ֵ��
		Integer secondValue=Integer.valueOf(s);
		//���ַ���ת��Ϊ��Ӧ��ֵ
		int a=Integer.parseInt(s);
		System.out.println(a);
		
		if(secondValue==1230)
		System.out.println(secondValue);
		
		
	}

}
