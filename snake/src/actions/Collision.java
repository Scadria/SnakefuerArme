package actions;

import game.Dir;
import game.Snake;

public class Collision {
	
	public static boolean collideself() {
		
		for (int i = 0; i < Snake.tails.size(); i++) {
			if (Snake.head.getX() == Snake.tails.get(i).getX() && Snake.head.getY() == Snake.tails.get(i).getY() && !Snake.tails.get(i).isWait()) {
				return true;
			}
		}
		
		return false;
	}

	
	
	public static boolean collideWall() {
		return (Snake.head.getX() < 0 || Snake.head.getX() > 15 || (Snake.head.getY() < 0 || Snake.head.getY() > 15));
	}
	
	public static void collidePickup() {
		if (Snake.head.getX() == Snake.pickup.getX() && Snake.head.getY() == Snake.pickup.getY()) {
			Snake.pickup.reset();
			Snake.addTail();
			//Scoreboard
			Snake.score += 1;
			if (Snake.score > Snake.bestscore) {
				Snake.bestscore = Snake.score;
			}
		}
	}
	
	public static void collidePoison() {
		if (Snake.head.getX() == Snake.poison.getX() && Snake.head.getY() == Snake.poison.getY()) {
			Snake.poison.reset();
			collide();
		}
		
		if (Snake.head.getX() == Snake.poisonzwei.getX() && Snake.head.getY() == Snake.poisonzwei.getY()) {
			Snake.poisonzwei.reset();
			collide();
		}	
		
		if (Snake.head.getX() == Snake.poisondrei.getX() && Snake.head.getY() == Snake.poisondrei.getY()) {
			Snake.poisondrei.reset();
			collide();
		}
		
		if (Snake.head.getX() == Snake.poisonvier.getX() && Snake.head.getY() == Snake.poisonvier.getY()) {
			Snake.poisonvier.reset();
			collide();
		}
		
		if (Snake.head.getX() == Snake.poisonfünf.getX() && Snake.head.getY() == Snake.poisonfünf.getY()) {
			Snake.poisonfünf.reset();
			collide();
		}
		
	}
	
		
	public static void collide() {
		Snake.tails.clear();
		Snake.head.setX(7);
		Snake.head.setY(7);
		Snake.head.setDir(Dir.RIGHT);
		//Score
		Snake.score = 0;
	}
	
}
