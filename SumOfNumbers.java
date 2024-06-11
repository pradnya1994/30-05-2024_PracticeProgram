//Write a Java program that takes two values as input and displays the sum of two numbers

package practice30_05_2024;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number : ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		int sum = num1+num2;
		System.out.println("Sum of two numbers is : " +sum);
	}

}
