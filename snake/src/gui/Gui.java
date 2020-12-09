package gui;

import java.awt.Frame;

import javax.swing.JFrame;

import actions.KeyHandler;

public class Gui {

	
	Frame jf;
	Draw d;
	
	public static int width = 800, height = 600;
	public static int xoff = 130, yoff = 20;
	
	  
	  //JFrame
	  
	  public void create(){
	    
	    jf = new JFrame();
	    jf.setTitle("Snake");
	    jf.setSize(width, height);
	    ((JFrame) jf).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.setLocationRelativeTo(null);
	    jf.setLayout(null);
	    jf.setResizable(false);
	    jf.addKeyListener(new KeyHandler());
	    
	    d = new Draw();
	    d.setBounds(0, 0, width, height);
	    d.setVisible(true);
	    jf.add(d);
	    
	    jf.requestFocus();
	    jf.setVisible(true);
	  }
	  
	  // Ende Methoden
	} // end of Gui
