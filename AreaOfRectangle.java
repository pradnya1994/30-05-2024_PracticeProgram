//Write a Java program to print the area and perimeter of a rectangle

package practice30_05_2024;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		float RectangleArea;
		float RectanglePerimeter;
		float length;
		float width;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of rectangle : ");
		length = scanner.nextFloat();
		System.out.println("Enter the width of rectangle : ");
		width = scanner.nextFloat();
		scanner.close();
		
		RectangleArea = length*width;
		
		System.out.println("Area of rectangle is : " +RectangleArea);
		
		RectanglePerimeter = 2*(length+width);
		 
		System.out.println("Parameter of circle is : "+RectanglePerimeter);

	}

}
