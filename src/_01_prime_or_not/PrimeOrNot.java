package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		int yesorno = 0;
		String snum = JOptionPane.showInputDialog("Type in a number:");
		int number = Integer.parseInt(snum);
		
		for(int i = 2; i < number; i++) {
	        if(number % i == 0) {
	            JOptionPane.showMessageDialog(null, "Your number isn't prime");
	            yesorno = 1;
	            break;
	            
	        }
		}
			if (yesorno == 0) {
			JOptionPane.showMessageDialog(null, "Your number is prime");
			}
		
	}
}
