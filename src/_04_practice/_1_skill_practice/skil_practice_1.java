package _04_practice._1_skill_practice;

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
		
	}
static void skill3() {
	
}
static void skill4() {
	
}
static void skill5() {
	
}

}
