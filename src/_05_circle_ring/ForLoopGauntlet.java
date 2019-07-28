package _05_circle_ring;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		
		
		
		//challenge 1 
		
		/*
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		*/
		
		
		//challenge 2
		
		/*
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		*/
		
		//challenge 3
		
		/*
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		*/
		
		//challenge 4
		
		/*
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		*/
		
		//challenge 5
		
		/*
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			}
			else {
				System.out.println(i + " is odd");
			}
		}
		*/
		
		
		//challenge 6
		
		/*
		for (int i = 1; i <= 777; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		*/
		
		//challenge 7
		
		
		for (int i = 0; i <= 15; i++) {
			int year = 2003 + i;
			System.out.println("In " + year + ", I was " + i + " years old.");
			if (i == 1) {
				System.out.println("In " + year + ", I was " + i + " year old.");
			}
		}
		
		
		
		
	}
}
