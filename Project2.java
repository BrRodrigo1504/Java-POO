package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Project1  {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		x = new Rectangle();
		
		System.out.println("Enter the measures of the Rectangle:");
		x.height = sc.nextDouble();
		x.width = sc.nextDouble();		
		
		
		double areaX = x.area();
		double perimeterX = x.perimeter();
		double diagonalX = x.diagonal();
		
		System.out.println();
		System.out.println("The area of this rectangle is: " + x.area());
		System.out.println();
		System.out.println("The perimeter of this rectangle is: " + x.perimeter());
		System.out.println();
		System.out.println("The diagonal of this rectangle is: " + x.diagonal());
	}

}
