package langLearning;

public class CharacterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = {'*', '7', 'b', ' ', 'A'};
	    for (int i = 0; i < charArray.length; i++) {
	      if (Character.isDigit(charArray[i])) {
	        System.out.println(charArray[i] + "��һ�����֡�");
	      }
	      if (Character.isLetter(charArray[i])) {
	        System.out.println(charArray[i] + "��һ����ĸ��");
	      }
	      if (Character.isWhitespace(charArray[i])) {
	        System.out.println(charArray[i] + "��һ���ո�");
	      }
	      if (Character.isLowerCase(charArray[i])) {
	        System.out.println(charArray[i] + "��Сд��ʽ��");
	      }
	      if (Character.isUpperCase(charArray[i])) {
	        System.out.println(charArray[i] + "�Ǵ�д��ʽ��");
	      }
	    }
	  }
	}