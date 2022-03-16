package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" }, null);
		int result = 0;
		// 3) Call the correct method depending on what option the user chooses
		if (task == 0) {
			result = add(number1, number2);
		}
		else if (task == 1){
			result = sub(number1, number2);
		}
		else if (task == 2){
			result = multi(number1, number2);
		}
		else if (task == 3){
			result = div(number1, number2);
		}
		
		JOptionPane.showMessageDialog(null, "Your answer is " + result);
		// 4) Call the result() method and put the answer in a pop-up
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 public static int add(int num1, int num2) {
		return num1 + num2;
	 }
	 public static int sub(int num1, int num2) {
			return num1 - num2;
		 }
	 public static int multi(int num1, int num2) {
			return num1 * num2;
		 }
	 public static int div(int num1, int num2) {
			return num1 / num2;
		 }
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
