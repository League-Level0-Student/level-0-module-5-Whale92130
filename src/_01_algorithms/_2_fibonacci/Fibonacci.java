package _01_algorithms._2_fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long q = 0;
		long w = 1;
		long sum = 1;
		System.out.println(q);
		System.out.println(w);
		for (long count = 0; count < 100000000; count++) {
			sum = (q + w);
			q = w;
			w = sum;
			System.out.println(sum);
			
		}
	}

}
