package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skil_practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int skill = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "skill 1", "skill 2", "skill 3", "skill 4", "skill 5" }, null);
		int result = 0;
		// 3) Call the correct method depending on what option the user chooses
		if (skill == 0) {
			skill1();
		}
		else if (skill == 1){
			skill2();
		}
		else if (skill == 2){
			skill3();
		}
		else if (skill == 3){
			skill4();
		}
		else if (skill == 4){
			skill5();
		}
	}
static void skill1() {
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimesInt = Integer.parseInt(dimes);
		dimesInt = dimesInt * 10;
		System.out.println("You have " + dimesInt + " cents.");
		String hieght = JOptionPane.showInputDialog("How tal are you in inches?");
		int Hint = Integer.parseInt(hieght);
		if (Hint < 36) {
			System.out.println("Eat your Wheaties.");
		}
	}
static void skill2() {
		for (int slam = 0; slam < 31; slam++) {
			if (slam % 3 == 0) {
				System.out.println(slam);
			}
		}
	}
static void skill3() {
	int random = new Random().nextInt(18+1);
	int random2 = new Random().nextInt(8+1);
	System.out.println(random - random2);
}
static void skill4() {
	String city = JOptionPane.showInputDialog("What city do u live in?");
	if (city.equalsIgnoreCase("San Diego")) {
		System.out.println("You live in America's Finest City.");
	}
	else {
		System.out.println("Move to San Diego");
	}
	String cars = JOptionPane.showInputDialog("How cars do you have?");
	int carsI = Integer.parseInt(cars);
	if (carsI == 0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
	}
	
	else if (carsI == 1) {
		JOptionPane.showMessageDialog(null, "We have aHonda Oddesey elite 2019.");
	}
	else {
		JOptionPane.showMessageDialog(null, "You have a total of " + carsI*4 + " wheels.");
	} 
}
static void skill5() {
	String school = JOptionPane.showInputDialog("What school do you go to?");
	JOptionPane.showMessageDialog(null, "The school " + school + " is a fantastic school.");
}

}
