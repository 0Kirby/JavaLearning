package langLearning;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strBuf = new StringBuffer("Java");
		strBuf.append(" Guide Ver1/");  //����
        System.out.println(strBuf);
        strBuf.append(5);
        System.out.println(strBuf);

        strBuf.insert(5, "Student");    //����
        System.out.println(strBuf);
    
        strBuf.setCharAt(20, '.');      //�滻�ַ�
        System.out.println(strBuf);
    
        strBuf.reverse();               //����
        System.out.println(strBuf);
    
        String str = strBuf.toString();
        System.out.println(str);

	}

}
