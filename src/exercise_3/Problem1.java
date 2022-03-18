package exercise_3;

import javax.swing.text.PlainDocument;

class BadDog{
	public void play(String item) {
		if(item.equals("stick")) {
			System.out.println("you beat I bite.....");
		}
		else if (item.equals("stone")) {
			System.out.println("I throw I chase you not stone...");
		}
		else if(item.equals("ball")) {
			System.out.println("you throw I catch...");
		}
	}
}

class GoodDog{
	public void play(Item item) {
		item.action();
	}
	
}

class Item{
	public void action() {
		System.out.println("I am dummy...");
	}
}

class Stick extends Item{
	public void action() {
		System.out.println("you beat I bite.....");
	}
}

class Stone extends Item{
	public void action() {
		System.out.println("I throw I chase you not stone...");
	}
}

class Ball extends Item{
	public void action() {
		System.out.println("you throw I catch...");
	}
}



public class Problem1 {
	public static void main(String[] args) {
		new GoodDog().play(new Stick());
		new GoodDog().play(new Stone());
		new GoodDog().play(new Ball());
	}
}
