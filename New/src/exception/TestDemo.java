package exception;

import java.io.IOException;

public class TestDemo {
	void method1() throws IOException{}  //�Ϸ�    
	   
	//������󣬱��벶��������׳�IOException    
	void method2() throws IOException{    
	  method1();    
	}    
	   
	//�Ϸ��������׳�IOException    
	void method3()throws IOException {    
	  method1();    
	}    
	   
	//�Ϸ��������׳�Exception��IOException��Exception������    
	void method4()throws Exception {    
	  method1();    
	}    
	   
	//�Ϸ�������IOException    
	void method5(){    
	 try{    
	    method1();    
	 }catch(IOException e){}    
	}    
	   
	//������󣬱��벶��������׳�Exception    
	void method6() throws Exception{    
	  try{    
	    method1();    
	  }catch(IOException e){throw new Exception();}    
	}    
	   
	//�Ϸ��������׳�Exception    
	void method7()throws Exception{    
	 try{    
	  method1();    
	 }catch(IOException e){throw new Exception();}    
	}   
}
