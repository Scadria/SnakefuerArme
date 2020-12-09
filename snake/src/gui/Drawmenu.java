package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import actions.Menu;

public class Drawmenu extends JLabel{

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		
		//draw background
		g.setColor(Color.black);
		g.fillRect(0, 0, Gui.width, Gui.height);
		
		//draw Titel
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.BOLD, 40));
		g.drawString("Menu", 90, 75 );
		
		//draw startbutton
		Menu.startbutton.setBackground(Color.white);
		Menu.startbutton.setText("Start");
		Menu.startbutton.setBounds(0, 350, 300, 50);
		
		//draw Jlabel
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("Wähle eine Farbe:", 20, 130 );
		//
		Menu.color.setVisible(true);
		Menu.color.setBounds(20, 90, 150, 50);
		Menu.color.setBackground(Color.white);
		Menu.color.setFont(new Font("Arial", Font.TYPE1_FONT, 20));
		Menu.color.setText("Wähle die Farbe der Schlange");
		Menu.color.setForeground(Color.black);
	
		//draw CheckBox
		Menu.green.setVisible(true);
		Menu.green.setBounds(20, 150, 100, 40);
	    Menu.green.setBackground(Color.green);
	    Menu.green.setText("Grün");
	    Menu.green.setForeground(Color.gray);
	   
	    Menu.blue.setVisible(true);
	    Menu.blue.setBounds(20, 200, 100, 40);
	    Menu.blue.setBackground(Color.blue);
	    Menu.blue.setText("Blau");
	    Menu.blue.setForeground(Color.white);
	    
	    Menu.yellow.setVisible(true);
	    Menu.yellow.setBounds(20, 250, 100, 40);
	    Menu.yellow.setBackground(Color.yellow);
	    Menu.yellow.setText("Gelb");
	    Menu.yellow.setForeground(Color.black);
	    
	}
}
