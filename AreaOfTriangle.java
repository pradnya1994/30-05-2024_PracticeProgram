//Write a Java program to print the area of a traingle

package practice30_05_2024;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		float TriangleArea;
		float base;
		float perpendicularHeight;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the base of triangle : ");
		base = scanner.nextFloat();
		System.out.println("Enter the perpendicularHeight of triangle : ");
		perpendicularHeight = scanner.nextFloat();
		scanner.close();
		
		TriangleArea = 1/2*(base*perpendicularHeight);
		
		System.out.println("Area of triangle is : " +TriangleArea);

	}

}
