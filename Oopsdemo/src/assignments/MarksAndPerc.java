package assignments;
//Calculating the total marks and percentage 
import java.util.Scanner;

public class MarksAndPerc {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		float a,b,c,total,perc;
		
		System.out.println("Enter the marks in subject 1 :");
		a=scan.nextFloat();
		System.out.println("Enter the marks in subject 2 :");
		b=scan.nextFloat();
		System.out.println("Enter the marks in subject 3 :");
		c=scan.nextFloat();
		scan.close();
		
		total=a+b+c;
		perc=(total/300)*100;
		
		System.out.println("The total marks scored are : "+total);
		System.out.println("The percentage scored is: "+ perc);

	}

}
