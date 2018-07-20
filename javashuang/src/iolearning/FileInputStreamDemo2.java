package iolearning;

import java.io.*;

public class FileInputStreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Test2.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			byte buf[] = new byte[(int) file.length()];
			fis.read(buf);
			String str = new String(buf);
			System.out.println(str);
			fis.close();
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			System.out.println("文件打开失败.");
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
