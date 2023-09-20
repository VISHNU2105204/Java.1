/*Practical6 : Write a program for Weight on Mars calculator is one of the fun and
simple programs of Java to implement as a beginner. This program calculates a
person’s weight on Mars based on their weight on Earth. All you need to do is ask
the user for their weight on Earth and then print out their weight on Mars. In order
to convert weight on Earth to weight on Mars, use the coefficient of 0.38. This
means that if someone weighs 100 pounds on Earth, they would weigh 38 pounds
on Mars.*/

import java.util.Scanner;

public class Practical6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Weight on Earth (in pound): ");
		
		double earthWeight = sc.nextDouble();
		
		double marsWeight = earthWeight * 0.38;
		
		System.out.println("Your weight on mars would be: " + marsWeight + " pounds");
		
	}

}
