package assignments;
//Program that calculates the sum, diff, multiplication ,greatest and smallest of all the numbers
import java.util.Scanner;

public class SumAvgProdGreatSmall {

	public static void main(String[] args) {
		int x, y,z,sum,prod;
		float avg;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the three integer values : ");
		x= scan.nextInt();
		y=scan.nextInt();
		z=scan.nextInt();
		scan.close();
		
		sum=x+y+z;
		prod=x*y*z;
		avg= (x+y+z)/3;
		
		System.out.println("Sum of the three numbers is : "+ sum);
		System.out.println("Product of the three numbers is : "+ prod);
		System.out.println("Average of the three numbers is : "+ avg);
		
		if(x>y && x>z) {
			System.out.println(x + " is greatest of all the numbers ");
		}
		
		else if(y>z) {
			System.out.println(y+ " is greatest of all the numbers ");
		}
		
		else {
			System.out.println(z+ " is greatest of all the numbers ");
		}
		
		if(x<y && x<z) {
			System.out.println(x + " is smallest of all the numbers ");
		}
		
		else if(y<z) {
			System.out.println(y+ " is smallest of all the numbers ");
		}
		
		else {
			System.out.println(z+ " is smallest of all the numbers ");
		}
		

	}

}
