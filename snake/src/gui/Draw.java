package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import actions.Menu;
import game.Snake;

public class Draw extends JLabel{
	
	Point p;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		
		//draw background
		g.setColor(Color.white);
		g.fillRect(0, 0, Gui.width, Gui.height);
		
		//Draw Snake Tails
		
		if (Menu.green.isSelected()) {
			g.setColor(new Color(51, 204, 51));
		}
		if (Menu.blue.isSelected()) {
			g.setColor(new Color(100, 149, 237));
		}
		if (Menu.yellow.isSelected()) {
			g.setColor(new Color(238, 238, 000));
		}
		
		
		for(int i = 0; i < Snake.tails.size(); i++) {
			p = Snake.ptc(Snake.tails.get(i).getX(), Snake.tails.get(i).getY());
			g.fillRect(p.x,  p.y, 32, 32);
		}
		
		//Draw Snake Head
		if (Menu.green.isSelected()) {
			g.setColor(Color.green);
		}
		if (Menu.blue.isSelected()) {
			g.setColor(Color.blue);
		}
		if (Menu.yellow.isSelected()) {
			g.setColor(Color.yellow);
		}
		
		p = Snake.ptc(Snake.head.getX(), Snake.head.getY());
		g.fillRect(p.x, p.y, 32, 32);	
		
		//Draw PickUp
		g.setColor(Color.red);
		p = Snake.ptc(Snake.pickup.getX(), Snake.pickup.getY());
		g.fillRect(p.x + 8, p.y + 8, 16, 16);
		
		//Draw Poison
		g.setColor(Color.BLACK);
		p = Snake.ptc(Snake.poison.getX(), Snake.poison.getY());
		g.fillRect(p.x + 8, p.y + 8, 16, 16);
		p = Snake.ptc(Snake.poisonzwei.getX(), Snake.poisonzwei.getY());
		g.fillRect(p.x + 8, p.y + 8, 16, 16);
		p = Snake.ptc(Snake.poisondrei.getX(), Snake.poisondrei.getY());
		g.fillRect(p.x + 8, p.y + 8, 16, 16);
		p = Snake.ptc(Snake.poisonvier.getX(), Snake.poisonvier.getY());
		g.fillRect(p.x + 8, p.y + 8, 16, 16);
		p = Snake.ptc(Snake.poisonfünf.getX(), Snake.poisonfünf.getY());
		g.fillRect(p.x + 8, p.y + 8, 16, 16);
		
		//draw grid
		g.setColor(Color.gray);
		for (int i = 0;  i < 16; i++) {
			for(int j = 0; j < 16; j++) {
				g.drawRect(i * 32 + Gui.xoff, j * 32 + Gui.yoff,  32,  32);
			}
		}
		
		//draw Border
		g.setColor(Color.black);
		g.drawRect(Gui.xoff, Gui.yoff, 512, 512);
		repaint();
		
		//Draw Score
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("Score" +Snake.score, 5, 25 );
		g.drawString("Best" + Snake.bestscore, 655, 25);
		
		
	}
	
	
	
	
	
}
