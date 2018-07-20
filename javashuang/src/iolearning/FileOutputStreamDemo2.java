package iolearning;

import java.io.FileOutputStream;

public class FileOutputStreamDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String str = "I love Java!";
		FileOutputStream fos = new FileOutputStream("Test4.txt");
		byte []buffer= str.getBytes();
		fos.write(buffer);
		fos.close();
	}

}
