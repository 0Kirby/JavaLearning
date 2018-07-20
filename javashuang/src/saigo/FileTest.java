package saigo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		
		String s="helloworld";
		//创建文件
		File file=new File("d:/s1.txt");
		
		//输出流
		@SuppressWarnings("resource")
		FileOutputStream fo=new FileOutputStream(file,true);
		
		//输出s
		for(int i=0;i<s.length();i++){
			try {
				fo.write(s.charAt(i));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
