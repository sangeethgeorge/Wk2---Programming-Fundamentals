package week2Lab;
//
import java.util.Scanner;
import java.lang.Math;

public class DistCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input x1:");
			double x1 = scan.nextDouble();
		System.out.println("Input y1:");
			double y1 = scan.nextDouble();
		System.out.println("Coordinates (x1,y1) = "+"("+x1+","+y1+")");
			System.out.println("Input x2:");
			double x2 = scan.nextDouble();
		System.out.println("Input y1:");
			double y2= scan.nextDouble();
			System.out.println("Coordinates (x2,y2) = "+"("+x2+","+y2+")");
			double distance = Math.sqrt((x2-x1) + (y2-y1));
			System.out.printf("Distance between 2 points:%.3f", distance);
	}

}
