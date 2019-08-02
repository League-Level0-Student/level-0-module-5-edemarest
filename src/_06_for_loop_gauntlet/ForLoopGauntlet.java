package _06_for_loop_gauntlet;

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
		
		/*
		for (int i = 0; i <= 15; i++) {
			int year = 2003 + i;
			if(i > 1) {
			System.out.println("In " + year + ", I was " + i + " years old.");
			}
			if(i == 1) {
				System.out.println("In " + year + ", I was " + i + " year old.");
			}
			if(i == 0) {
				System.out.println("In " + year + ", I was just born and " + i + " years old.");
			}
		}
		*/
		//Nested For-Loops
		
		
		//challenge 1
		
		/*
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
			System.out.println(i+" "+j);
			}
		*/
		
		//challenge 2
		/*
		for(int i = 1; i < 10; i+=3) {
				for(int x = i;x < i + 3; x++) {
					System.out.print(x);
					}
				System.out.println();
				}
			*/
		
		//challenge 3
		
		for(int i = 1; i < 101; i+=10) {
			for(int x = i;x < i + 10; x++) {
				if(x < 10) {
					System.out.print(x+"  ");
				}
				else {
				System.out.print(x+" ");
				}
				}
			System.out.println();
			}
	}
		
		
		
		
		
		//challenge 4
		/*
		for(int i = 1; i < 8; i++) {
			for (int w = 1; w < i; w++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		//BONUS challenge
		/*
		for(int i = 0; i < 101; i++) {
			System.out.println(100 - i);
		}
			
		}
		*/
		
		
			
			
			
			
		
	}

