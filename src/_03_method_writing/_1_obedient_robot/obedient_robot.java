package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String shape = JOptionPane.showInputDialog(null, "What shape should I draw square, circle, ot triangle?");
		if (shape.equals("square")) {
			square();
		}
		else if (shape.equals("triangle")) {
			triangle();
		}
		else if (shape.equals("circle")) {
			circle();
		}
}
	public static void square() {
		Robot rob = new Robot();
		rob.setX(100);
		rob.setY(500);
		rob.penDown();
		rob.setSpeed(500);
		
		String color = JOptionPane.showInputDialog(null, "What color should I use red, green, blue, or, black?");
		
		if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		else if(color.equals("green")) {
			rob.setPenColor(100,255,100);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(0,0,255);
		}
		else if(color.equals("black")) {
			rob.setPenColor(0,0,0);
		}
		for (int q = 0; q < 4; q++) {
		rob.move(400);
		rob.turn(90);
		}
	}
	
	public static void triangle() {
		Robot rob = new Robot();
		rob.setX(100);
		rob.setY(500);
		rob.penDown();
		rob.setSpeed(500);
		
		String color = JOptionPane.showInputDialog(null, "What color should I use red, green, blue, or, black?");
		
		if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		else if(color.equals("green")) {
			rob.setPenColor(100,255,100);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(0,0,255);
		}
		else if(color.equals("black")) {
			rob.setPenColor(0,0,0);
		}
		for (int q = 0; q < 3; q++) {
		rob.move(400);
		rob.turn(120);
		}
	}

	public static void circle() {
		Robot rob = new Robot();
		rob.setX(200);
		rob.setY(300);
		rob.penDown();
		rob.setSpeed(1000);
		
		String color = JOptionPane.showInputDialog(null, "What color should I use red, green, blue, or, black?");
		
		if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		else if(color.equals("green")) {
			rob.setPenColor(100,255,100);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(0,0,255);
		}
		else if(color.equals("black")) {
			rob.setPenColor(0,0,0);
		}
		for (int q = 0; q < 360; q++) {
		rob.move(3);
		rob.turn(1);
		}
	}
}
