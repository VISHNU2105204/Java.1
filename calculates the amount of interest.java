/*Practical8 : Write a program calculates the amount of interest earned on an
investment over a period of time and is among simpler programs of Java for a
starting Java developer. All you need to do is ask the user for the initial investment
amount, the interest rate, and the number of years. Then print out the total amount
of interest earned. Use Java exponentiation to calculate the compounding interest.*/

import java.util.Scanner;

public class Practical8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the initial investment amount: ");
		double principal = sc.nextDouble();
		
		System.out.print("Enter the annual interest rate (in percentage): ");
		double annualInterestRate = sc.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 100 / 12;
		
		System.out.print("Enter the number of years: ");
		int years = sc.nextInt();
		
		double totalAmount = principal * Math.pow(1 + monthlyInterestRate, years * 12);
		
		double totalInterestEarned = totalAmount - principal;
		System.out.println("Total interest earned over " + years + 
				" years: rs:-" + totalInterestEarned);
		}
	}
