package iolearning;

import java.io.*;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File srcFile = new File("Test3.txt");
		File destFile = new File("Test5.txt");
	    if (!(destFile.exists())) {  
	        destFile.createNewFile();  
	      }
	    FileInputStream fis = new FileInputStream(srcFile);
	    FileOutputStream fos = new FileOutputStream(destFile);
	    byte buf[]=new byte[(int) srcFile.length()];
	    System.out.println("开始复制文件...");
	    while(fis.read(buf) !=-1)
	    	fos.write(buf);
	    System.out.println("文件复制完毕！");
	    fis.close();
	    fos.close();
	}

}
