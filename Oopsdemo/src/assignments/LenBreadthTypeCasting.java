package assignments;
//Calculating the area which is typecasted to int
import java.util.Scanner;

public class LenBreadthTypeCasting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double length, breadth,area;
		System.out.println("Enter the length : ");
		length=scan.nextDouble();
		System.out.println("Enter the breadth :");
		breadth=scan.nextDouble();
		scan.close();

		area=length*breadth;
		
		System.out.println("The area of the rectange is "+ (int)area);

	}

}
