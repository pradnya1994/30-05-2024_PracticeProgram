//Write a Java program that takes a number as input and prints its multiplication table up to 10.

package practice30_05_2024;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number;
		System.out.println("Enter first number : ");
		number = scanner.nextInt();
		scanner.close();
		
		for(int i=1; i<=10 ; i++)
		{
			System.out.println(number+"*"+i+"=" +number*i);
		}
		
	}

}
