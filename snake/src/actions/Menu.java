package actions;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import clocks.GameClock;
import gui.Drawmenu;

public class Menu {
	
	Frame menu;
	Drawmenu dm;
	
	public static int width = 300, height = 500;
	
	public static JLabel color = new JLabel();
	public static JRadioButton green = new JRadioButton();
	public static JRadioButton blue = new JRadioButton();
	public static JRadioButton yellow = new JRadioButton();
	public static ButtonGroup colorgroup = new ButtonGroup();
	public static JButton startbutton = new JButton();
	
	
	public void menu() {
	
		 menu = new JFrame();
		 menu.setTitle("Menu");
		 menu.setSize(width, height);
		 ((JFrame) menu).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 menu.setLocationRelativeTo(null);
		 menu.setLayout(null);
		 menu.setResizable(false);
		 menu.addKeyListener(new KeyHandler());
		    
		 dm = new Drawmenu();
		 dm.setBounds(0, 0, width, height);
		 dm.setVisible(true);
		 menu.add(dm);
		 
		 menu.add(color);
		 
		 colorgroup.add(green);
		 menu.add(green);
		 colorgroup.add(blue);
		 menu.add(blue);
		 colorgroup.add(yellow);
		 menu.add(yellow);
		    
		 startbutton.addActionListener(new ActionListener() { 
			 public void actionPerformed(ActionEvent evt) { 
				 try {
					startbutton_ActionPerfomed(evt);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }	
		 });
		 menu.add(startbutton);
		 
		 menu.requestFocus();
		 menu.setVisible(true); 

	}
	
	public void startbutton_ActionPerfomed(ActionEvent evt) throws InterruptedException {
		
		menu.setVisible(false);
		Thread.sleep(1000);
		startgame();
		
	}
	
	
	
	public void startgame() {
		
		GameClock gc = new GameClock();
		gc.start();
		
	}

	
	
	public JButton getStartbutton() {
		return startbutton;
	}
	public void setStartbutton(JButton startbutton) {
		this.startbutton = startbutton;
	}

}
