package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String numS = JOptionPane.showInputDialog(null, "Give #");
		int num = Integer.parseInt(numS);
		int count = num - 1;
		while (count > 1) {
		 if (num%count == 0) {
				System.out.println("Not prime");
				System.exit(0);
		}
		 count--;
	}
		System.out.println("Its' prime");
	}
}
