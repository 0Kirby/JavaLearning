package iolearning;

import java.io.*;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("Test2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
			System.out.println(str);
		fr.close();
		br.close();
	}
}
