//Java program to swap two numbers with using third variable
package practice30_05_2024;

import java.util.Scanner;

public class SwapValues {

	public static void main(String[] args) {
		
		//int a = 20, b=30 , temp;
		int temp;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of a: ");
		int a= sc.nextInt();
		 System.out.println("Enter the value of b: ");
		 int b = sc.nextInt();
		 sc.close();
		 
		temp = a;
		 a  = b;
		 b = temp;
		 
		 System.out.println("Value of a is : "+a);
		 System.out.println("Value of b is : "+b);
		 
		

	}

}
