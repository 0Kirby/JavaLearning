package saigo;

import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;
//import javax.swing.JPopupMenu;

public class FrameTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * 
	 */
	public FrameTest(){
		this.setTitle("ÎÒµÄ´°¿Ú");
		//this.setSize(400,200);
		this.setBounds(600,400,400,200);
		this.setVisible(true);
		this.setBackground(Color.gray);
	}
	

	public static void main(String[] args) {

		FrameTest fr=new FrameTest();
		//JPopupMenu jm=new  JPopupMenu();
		//fr.add(jm);
		Button bt=new Button("test");
		fr.add(bt);
		
	}

}
