package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot rob = new Robot();
		rob.setX(300);
		rob.setY(300);
		rob.penDown();
		String shape = JOptionPane.showInputDialog(null, "What shape should I draw square, circle, ot triangle?");
		String color = JOptionPane.showInputDialog(null, "What color should I use red, green, blue, or, black?");
		if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		else if(color.equals("green")) {
			rob.setPenColor(0,255,0);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(0,0,255);
		}
		else if(color.equals("black")) {
			rob.setPenColor(0,0,0);
		}
		
}
	public static void square() {

	}

}
