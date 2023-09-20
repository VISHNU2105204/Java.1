//Practical3 : Write a program to tell whether the given number is even or odd

import java.util.Scanner;

public class Practical3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int number = sc.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println(number + " is even.");
		}
		else
		{
			System.out.println(number + " is odd.");
		}	
	}
}
