package _04_guessing_pi;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	public static void main(String[] args) {

		String pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737";

		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.
		

			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()
		int length = pi.length();
		
		for (int i = 0; i <length; i++) {
			System.out.println(pi.charAt(i));
		}
		for (int i = 0; i < length; i++) {
			String guess = JOptionPane.showInputDialog("What is the next digit of pi?");
			int guessnum = Integer.parseInt(guess);
			String actualstring = Character.toString(pi.charAt(i));;
			int actualnum = Integer.parseInt(actualstring);
			if (guessnum == actualnum) {
				JOptionPane.showMessageDialog(null, "Correct!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect. Start over!");
				break;
			}
			
		}
				// 5. Ask the user for the NEXT digit of pi.
		
				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 

					// 7. If they are correct, print out "correct".

					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.
			
			
			
			
			
			
			
		}
}


