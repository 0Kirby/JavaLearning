package cp7;

import java.io.*;
import java.util.logging.Logger;

public class CacheTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufr = null;
		Logger.getGlobal().warning("aaa");
        try {
            FileReader fr = new FileReader("F:\\Python\\test.csv");
            bufr = new BufferedReader(fr);
            String line;
            try {
                while ((line = bufr.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (bufr != null) {
                try {
                    bufr.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
 
 
    }

}
