package exceptionLearning;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
	    try {
	      //从命令行参数获得用户输入的数字
	      a = Integer.parseInt(args[0]);
	      b = Integer.parseInt(args[1]);
	      c = a / b;
	      System.out.println(c);
	    }
	    
	    catch (ArrayIndexOutOfBoundsException aioobe) {  //捕捉数组下标越界异常
	      System.out.println("您没有指定命令行参数。");
	    }
	    catch (NumberFormatException nfe) {  //捕捉字符串到数字转换异常
	      System.out.println("您输入的不是数字。");
	    }
	    catch (ArithmeticException ae) {     //捕捉算术（除数为0）异常
	      System.out.println("除数为0。");
	    }
	    catch (Exception e) {                //捕捉其它不可预测的异常
	      System.out.println(e.getMessage());
	    }
	    System.out.println("程序结束。");
	  }
	}
