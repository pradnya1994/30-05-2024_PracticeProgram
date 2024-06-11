//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

package practice30_05_2024;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) 
	{

		float average;
		int sum =0;
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many number's average you want to calculate  : ");
		count = scanner.nextInt();
		for(int i=1;i<=count;i++)
		{
			System.out.println("Enter the number : ");
			int num = scanner.nextInt();
			sum = sum+num;

		}

		System.out.println("Sum of the numbers is : " + sum);

		average = sum/count;
		System.out.println("Average of the numbers is : " + average);

	}
	
}

