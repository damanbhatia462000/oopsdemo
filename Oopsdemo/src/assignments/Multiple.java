package assignments;
//Program that checks whether the first number is a multiple of the second number
import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b;
		float c;
		System.out.println("Please enter the first number:");
		a=scan.nextInt();
		System.out.println("Please enter the second number:");
		b=scan.nextInt();
		scan.close();
		c= a%b;
		if(a%b==0) {
			System.out.println(a +" is a multiple of "+b);
		}
		else {
			System.out.println(a+ " is not a multiple of "+b +" as the quotient is "+c);
		}

	}

}
