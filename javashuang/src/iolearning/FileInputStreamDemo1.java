package iolearning;

import java.io.*;


public class FileInputStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Test.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			for (int i = 0; i < file.length(); i++) {
		        char ch = (char)(fis.read());  
		        System.out.print(ch);
		      }
			System.out.println();
			fis.close();

		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			System.out.println("文件打开失败。");
			
		}catch(IOException ioe){
		ioe.printStackTrace();
		}
	}

}
