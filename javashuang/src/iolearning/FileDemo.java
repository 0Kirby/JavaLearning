package iolearning;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\aaa.txt");
		file.createNewFile();
		
		System.out.println("�ļ���Ŀ¼�Ƿ���ڣ�" + file.exists());
	    System.out.println("���ļ���" + file.isFile());
	    System.out.println("��Ŀ¼��" + file.isDirectory());
	    System.out.println("���ƣ�" + file.getName());
	    System.out.println("����·����" + file.getAbsolutePath());
	    System.out.println("����޸�ʱ�䣺" + file.lastModified());
	    System.out.println("�ļ���С��" + file.length());

	}

}
