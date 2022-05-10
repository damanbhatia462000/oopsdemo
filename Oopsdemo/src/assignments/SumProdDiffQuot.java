package assignments;
//Program that calculates the sum, diff, multiplication ,quotient of the given numbers
import java.util.Scanner;

public class SumProdDiffQuot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b,sum,mul,diff;
		float quot;
		
		System.out.println("Enter the first integer : ");
		a=scan.nextInt();
		System.out.println("Enter the second integer : ");
		b=scan.nextInt();
		scan.close();
		
		sum= a+b;
		mul= a*b;
		diff=a-b;
		quot=a%b;
		
		System.out.println(" The sum of the two numbers is : " + sum);
		System.out.println(" The multiplication of the two numbers is : " + mul);
		System.out.println(" The difference between the two numbers is : " + diff);
		System.out.println(" The quotient of the two numbers is : " + quot);

	}

}
