package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skill_practice {
public static void main(String[] args) {

skill_practice skills = new skill_practice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
	//challenge 1 
		/*
	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
	int dimesnum = Integer.parseInt(dimes);
	JOptionPane.showMessageDialog(null, "You have " + dimesnum*10 + " cents");
		*/


	//challenge 2
		/*
	String height = JOptionPane.showInputDialog("How tall are you in inches?");
	int heightnum = Integer.parseInt(height);
	if (heightnum < 36) {
	JOptionPane.showMessageDialog(null, "Eat your wheaties!");
	}
	    */




}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

	
	//challenge 3
		/*
	for (int i = 1; i < 11; i++) {
		System.out.println(i*3);
	}
		*/





}

void skill3() { 

	//challenge 4
		/*
	Random rand = new Random();
	int value = rand.nextInt(20);
	System.out.println(value);
	int valuet = rand.nextInt(10);
	System.out.println(valuet);
	int solution = value - valuet;
	JOptionPane.showMessageDialog(null, "The difference between the two numbers is: " + solution);
		*/

}

void skill4() { 

	//challenge 5
		/*
String city = JOptionPane.showInputDialog("What city do you live in?");
if (city.equals("San Diego")) {
	JOptionPane.showMessageDialog(null,  "You live in America's Finest City!");
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego.");
}
		*/


	//challenge 6
		/*
String cars = JOptionPane.showInputDialog("How many cars does your family have?");
int carnum = Integer.parseInt(cars);
if (carnum == 1) {
	JOptionPane.showMessageDialog(null, "Your car is a red Acura SUV!");
}
if (carnum == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation!");
}
else {
	int wheels = carnum * 4;
	JOptionPane.showMessageDialog(null, "Between all of your cars, there are " + wheels + " wheels!");
}
		*/


}

void skill5() { 

	
	//challenge 7
		/*
	String name = JOptionPane.showInputDialog("What is the name of your school?");
	if (name.contentEquals("Torrey Pines")) {
		JOptionPane.showMessageDialog(null, "Torrey Pines sucks!");
	}
	else {
		JOptionPane.showMessageDialog(null, name + " is a fantastic school!");
	}
		*/


}
}
