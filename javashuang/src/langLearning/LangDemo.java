package langLearning;

public class LangDemo {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean objBool = new Boolean(true);
		Character objChar = new Character('X');
		Integer objInt = new Integer(100);
		Long objLong = new Long(2568);
		Double objDou = new Double(3.1415);
		String str = "120";
		Byte objByte = Byte.valueOf(str);
		Short objShort = Short.valueOf(str);
	    Integer objInt2 = Integer.valueOf(str);
	    Long objLong2 = Long.valueOf(str);
		
		System.out.println(objBool);
		System.out.println(objChar);
		System.out.println(objInt);
		System.out.println(objLong);
		System.out.println(objDou);
		System.out.println(objByte);
		System.out.println(objShort);
		System.out.println(objInt2);
		System.out.println(objLong2);
	}

}
