package iolearning;

import java.io.*;

public class FileOutputStreamDemo1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		String str = new String("Hello world!");
		File file = new File("Test3.txt");
		FileOutputStream fos = new FileOutputStream(file,true);
		
	    for (int i = 0; i < str.length(); i++)
	    {
	      fos.write(str.charAt(i));
	    }
	    fos.close();    
	}

}
