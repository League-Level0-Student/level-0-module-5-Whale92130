 package _03_method_writing._2_happy_pet;
import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {
	
	static // 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	int Hlv = 0;
	static String pet = "no";
	Random rand = new Random();
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		pet = JOptionPane.showInputDialog(null, "What pet would you like to buy?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
			for (int shesh = 0; shesh < 101; shesh++) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do with your pet?", "Activities", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "feed", "water","walk", "groom", "clean","punch" }, null);
			if (task == 0) {
				cuddle();
			}
			else if (task == 1) {
				feed();
			}
			else if (task == 2) {
				water();
			}
			else if (task == 3) {
				walk();
			}
			else if (task == 4) {
				groom();
			}
			else if (task == 5) {
				clean();
			}
			else if (task == 6) {
				punch();
			}

			if (Hlv >= 100) {
				System.out.println("Your " + pet + " is happy enough");
				break;
			}
			if (Hlv <= -3000) {
				System.out.println("Your " + pet + " dies from punches");
				break;
			}
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	}
	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

public static void cuddle() {
	int random = new Random().nextInt(29+1);
	Hlv = Hlv + random;
	if (random > 15) {
	System.out.println("Your " + pet + " purrs");
}
	else {
		System.out.println("Your " + pet + " yawns and goes away");
	}
	Hlv++;
}
public static void feed() {
	int random = new Random().nextInt(29+1);
	Hlv = Hlv + random;
	if (random > 15) {
	System.out.println("Your " + pet + " conks out on the floor");
}
	else {
		System.out.println("Your " + pet + " is still hungry");
	}
	Hlv++;
}
public static void water() {
	int random = new Random().nextInt(29+1);
	Hlv = Hlv + random;
	if (random > 15) {
	System.out.println("Your " + pet + " turns into a water ballon");
}
	else {
		System.out.println("Your " + pet + " is still thirsty");
	}
	Hlv++;
}
public static void walk() {
	int random = new Random().nextInt(29+1);
	Hlv = Hlv + random;
	if (random > 15) {
	System.out.println("Your " + pet + " is too tired to sleep after walk and will not stop bugging you.");
}
	else {
		System.out.println("Your " + pet + " is taking to long to go to the bathroom while you walk");
	}
	Hlv++;
}
public static void groom() {
	int random = new Random().nextInt(29+1);
	Hlv = Hlv + random;
	if (random > 15) {
	System.out.println("Your " + pet + " enjoys the brushing");
}
	else {
		System.out.println("Your " + pet + " doesn't like the brush");
	}
	Hlv++;
}
public static void clean() {
	int random = new Random().nextInt(29+1);
	Hlv = Hlv + random;
	if (random > 15) {
	System.out.println("Your " + pet + " is clean");
}
	else {
		System.out.println("Your " + pet + " is still dirty");
	}
	Hlv++;
}
public static void punch() {
	int random = new Random().nextInt(29+1);
	Hlv = Hlv + random;
	if (random > 15) {
	System.out.println("Your " + pet + " hates you and runs away");
}
	else {
		System.out.println("Your " + pet + " still hates you and runs away");
	}
	Hlv++;
	Hlv = Hlv - 1000;
}
}