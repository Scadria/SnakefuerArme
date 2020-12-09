package clocks;

import actions.Collision;
import game.Snake;

public class GameClock extends Thread{
	
	public boolean running = true;
	
	public void run() {
		
		while (running) {
			try {
				sleep(200);
				Snake.move();
				Snake.waitToMove = false;
				Collision.collidePickup();
				Collision.collidePoison();
				if (Collision.collideself()) {
					Snake.tails.clear();
					//Score
					Snake.score = 0;
				}
				if (Collision.collideWall()) {
					Snake.tails.clear();
					Snake.head.setX(7);
					Snake.head.setY(7);
					//Score
					Snake.score = 0;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
}
