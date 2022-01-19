package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String numS = JOptionPane.showInputDialog(null, "Give #");
		int num = Integer.parseInt(numS);
		int count = 100;
		if (num%count > 0)
		 count--;
	}

}
