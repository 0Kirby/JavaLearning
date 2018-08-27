package cp7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "1.txt";
		try {
			InputStream in = new FileInputStream(filename);
			int b;
			while((b=in.read())!=-1) {
				System.out.print(b);
			}
			in.close();
		}
		
		catch(IOException e){
			e.printStackTrace();
			
		}
	
	}

}
