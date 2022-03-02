package _02_nested_loops._3_for_loop_gauntlet;

public class nested_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0-100
		 for(int q = 0; q < 101; q++) {
			 System.out.println(q);
		 }
		 //100-0
		 for(int w = 101; w > -1; w--) {
			 System.out.println(w);
		 }
		 //0-100 even
		 for (int e = 0; e < 101; e++) {
			 if( e%2==0) {
				 System.out.println(e);
			 }
		 }
		 //1-99 odd
		 for (int r = 1; r < 100; r++) {
			 if( r%2!=0) {
				 System.out.println(r);
			 }
		 }
		 //0-500 label even/odd
		 for (int t = 0; t < 501; t++) {
			 if( t%2==0) {
				 System.out.println(t + " is even");
			 }
			 else {
				 System.out.println(t + " is odd");
			 }
		 }
		 //0-777 all multiples of 7
		 for (int y = 0; y < 778; y++) {
			 if( y%7==0) {
				 System.out.println(y);
			 }
		 }
		 //year + age
		 int age = 0;
		 int year = 2022;
		 for (int u = 2009; u < year+1; u++) {
			 System.out.println(u + " " + age);
			 age++;
		 }
		 //displaying 10,11,12,20,21,etc
		 for(int i = 0; i < 3; i++) {
			 for(int o = 0; o < 3; o++) {
				 System.out.println(i+" "+o);
				 
			 }
		 }
		 //displaying 123, 456, 789
		 for(int p = 0; p < 3; p++) {
			 for(int a = 1; a < 4; a++) {
				 System.out.print(a+p+p+p + " ");
			 }
			 System.out.println();
		 }
		 //displaying 10x10 grid
		 for(int s = 0; s < 10; s++) {
			 for(int d = 1; d < 11; d++) {
				 System.out.print(d+s*10 + " ");
			 }
			 System.out.println();
		 }
		 //displaying *'s
		 for(int f = 0; f < 6; f++) {
			 for(int g = 0; g < 1 + f; g++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}

}
