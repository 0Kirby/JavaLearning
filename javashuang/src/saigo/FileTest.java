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
		//�����ļ�
		File file=new File("d:/s1.txt");
		
		//�����
		@SuppressWarnings("resource")
		FileOutputStream fo=new FileOutputStream(file,true);
		
		//���s
		for(int i=0;i<s.length();i++){
			try {
				fo.write(s.charAt(i));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
