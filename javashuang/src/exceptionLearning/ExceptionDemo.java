package exceptionLearning;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
	    try {
	      //�������в�������û����������
	      a = Integer.parseInt(args[0]);
	      b = Integer.parseInt(args[1]);
	      c = a / b;
	      System.out.println(c);
	    }
	    
	    catch (ArrayIndexOutOfBoundsException aioobe) {  //��׽�����±�Խ���쳣
	      System.out.println("��û��ָ�������в�����");
	    }
	    catch (NumberFormatException nfe) {  //��׽�ַ���������ת���쳣
	      System.out.println("������Ĳ������֡�");
	    }
	    catch (ArithmeticException ae) {     //��׽����������Ϊ0���쳣
	      System.out.println("����Ϊ0��");
	    }
	    catch (Exception e) {                //��׽��������Ԥ����쳣
	      System.out.println(e.getMessage());
	    }
	    System.out.println("���������");
	  }
	}
