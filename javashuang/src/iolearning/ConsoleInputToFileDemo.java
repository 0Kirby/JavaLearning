package iolearning;

import java.io.*;

public class ConsoleInputToFileDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("input.txt");   //�����ļ�����
		if (!file.exists())                  //�жϸ��ļ��Ƿ���ڣ�����������򴴽����ļ�
		{
		    file.createNewFile();
		}
		FileWriter fr = new FileWriter(file);   //����ļ����󴴽��ļ�д��������
		BufferedWriter bw = new BufferedWriter(fr);   //Ϊ�ļ�д��������������

		//������̨�������ת�����ַ�����������������
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

		String str = bin.readLine();    //���ܴӿ���̨�����һ���ַ���
		while (!(str.equals("!!!")))    //�������"!!!"������������
		{
		    bw.write(str);              //���ӿ���̨������ַ���д�뵽�ļ���
		    bw.newLine();               //������
		    str = bin.readLine();       //�ٴӿ���̨��������
		}

		//�ر������Ѿ��򿪵���
		bw.close();
		fr.close();
		bin.close();
	}

}
