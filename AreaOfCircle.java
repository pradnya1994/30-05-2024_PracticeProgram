//Write a Java program to print the area and perimeter of a circle.

package practice30_05_2024;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		float CircleArea;
		float CirclePerimeter;
		float pie = 3.14F;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the redius of circle : ");
		float redius = scanner.nextFloat();
		scanner.close();
		
		CircleArea = (float) (pie*Math.pow(redius, 2));
		
		System.out.println("Area of circle is : " +CircleArea);
		
		CirclePerimeter = 2*pie*redius;
		 
		System.out.println("Parameter of circle is : "+CirclePerimeter);

	}

}
