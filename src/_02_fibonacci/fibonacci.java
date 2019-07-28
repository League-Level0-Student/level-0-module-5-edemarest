package _02_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	

	int firstnum = 0;
	int secondnum = 1;
	System.out.println(firstnum);
	System.out.println(secondnum);

	
	for (int i = 0; i <12; i++) {
		System.out.println(firstnum + secondnum);
		int solution = firstnum + secondnum;
		firstnum = secondnum;
		secondnum = solution;
	}
}
}
