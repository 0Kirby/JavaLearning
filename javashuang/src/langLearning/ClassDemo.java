package langLearning;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				Class<?> cls = Class.forName("java.lang.StringBuffer");
				while (cls != null) {
					System.out.println(cls);
					cls = cls.getSuperclass();
				}
		}
		catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
	}

}
