package cp8;

import javax.swing.JOptionPane;

public class Comparation {

	public static void main(String args[]) {

		String firstNumber, // �û������1�����ݱ���

				secondNumber, // �û������2�����ݱ���

				result; // ����������

		int number1, // ���ڱȽϵĵ�1����

				number2; // ���ڱȽϵĵ�2����

//�û������1�����ݵ��ַ���

		firstNumber = JOptionPane.showInputDialog("�����1������:");

//�û������2�����ݵ��ַ���

		secondNumber = JOptionPane.showInputDialog("�����2������:");

//���ַ���ת��Ϊ��������

		number1 = Integer.parseInt(firstNumber);

		number2 = Integer.parseInt(secondNumber);

//��ʼ���������

		result = "";

//�Ƚ���������

		if (number1 == number2)

			result += number1 + " == " + number2;

		if (number1 != number2)

			result += number1 + " != " + number2;

		if (number1 < number2)

			result = result + "\n" + number1 + " < " + number2;

		if (number1 > number2)

			result = result + "\n" + number1 + " > " + number2;

		if (number1 <= number2)

			result = result + "\n" + number1 + " <= " + number2;

		if (number1 >= number2)

			result = result + "\n" + number1 + " >= " + number2;

//��ʾ���

		JOptionPane.showMessageDialog(null, result, "�ȽϽ��",

				JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);

	}

}