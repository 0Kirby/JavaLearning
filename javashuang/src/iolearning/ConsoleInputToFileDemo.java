package iolearning;

import java.io.*;

public class ConsoleInputToFileDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("input.txt");   //创建文件对象
		if (!file.exists())                  //判断该文件是否存在，如果不存在则创建新文件
		{
		    file.createNewFile();
		}
		FileWriter fr = new FileWriter(file);   //针对文件对象创建文件写入流对象
		BufferedWriter bw = new BufferedWriter(fr);   //为文件写入流建立缓冲流

		//将控制台输入对象转化成字符流，并建立缓冲流
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

		String str = bin.readLine();    //接受从控制台输入的一行字符串
		while (!(str.equals("!!!")))    //如果输入"!!!"则代表输入结束
		{
		    bw.write(str);              //将从控制台输入的字符串写入到文件中
		    bw.newLine();               //换新行
		    str = bin.readLine();       //再从控制台接受输入
		}

		//关闭所有已经打开的流
		bw.close();
		fr.close();
		bin.close();
	}

}
