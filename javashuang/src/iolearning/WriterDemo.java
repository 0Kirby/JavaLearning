package iolearning;

import java.io.*;

public class WriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Test6.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("��Һã�");
		bw.write("������ѧϰJava��");
	    bw.newLine();    //��������
	    bw.write("����ָ�̡�");
	    bw.newLine();    //������
	    bw.write("Luckybug@21cn.com");
	    bw.close();
	    fw.close();
	}

}
