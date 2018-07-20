package iolearning;

import java.io.*;

public class WriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Test6.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("大家好！");
		bw.write("我正在学习Java。");
	    bw.newLine();    //换个新行
	    bw.write("请多多指教。");
	    bw.newLine();    //换新行
	    bw.write("Luckybug@21cn.com");
	    bw.close();
	    fw.close();
	}

}
