/*Practical11 : Write a program to find the sum of all elements in the array*/

public class Practical11 {

	public static void main(String[] args) {

		int []arr = {10, 20, 30, 40, 50, 60, 70, 80};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			}
		System.out.println(sum);
		}
	}
