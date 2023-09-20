/*Practical9 : Write a program should print a diamond shape to the console. The user
should specify the height of the diamond, which will always be an odd number. For
example, if the user specifies a height of 5.*/

public class Practical9 {
	
	public static void main(String[] args) {
	
		for (int i = 1; i <= 5; i++) {
			for(int j = i; j <= 4; j++) {
				System.out.print(" ");
				}
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
				}
			System.out.println();
			}
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
				}
			for(int k = i; k < 5; k++) {
				System.out.print("* ");
				}
			System.out.println();
			}
		}
	}
