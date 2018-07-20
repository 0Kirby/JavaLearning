package exception;

import java.io.IOException;

public class TestDemo {
	void method1() throws IOException{}  //合法    
	   
	//编译错误，必须捕获或声明抛出IOException    
	void method2() throws IOException{    
	  method1();    
	}    
	   
	//合法，声明抛出IOException    
	void method3()throws IOException {    
	  method1();    
	}    
	   
	//合法，声明抛出Exception，IOException是Exception的子类    
	void method4()throws Exception {    
	  method1();    
	}    
	   
	//合法，捕获IOException    
	void method5(){    
	 try{    
	    method1();    
	 }catch(IOException e){}    
	}    
	   
	//编译错误，必须捕获或声明抛出Exception    
	void method6() throws Exception{    
	  try{    
	    method1();    
	  }catch(IOException e){throw new Exception();}    
	}    
	   
	//合法，声明抛出Exception    
	void method7()throws Exception{    
	 try{    
	  method1();    
	 }catch(IOException e){throw new Exception();}    
	}   
}
