package utilLearning;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
		
		vec.addElement("Java");
	    vec.addElement("C#");
	    vec.addElement("Oracle");
	    vec.addElement("C++");
	    vec.addElement("HTML");

	    System.out.println(vec.toString());

	    vec.removeElement("C++"); 
	    System.out.println(vec.toString());

	}

}
