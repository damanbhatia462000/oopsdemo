package basics;

import java.util.Scanner;

/*Program to find the greatest of two numbers*/ 
public class Greatest2 {

	public static void main(String[] args) {
		int a,b;
        Scanner scan=new Scanner(System.in);
       
        System.out.println("Enter 2 Numbers :");
        a=scan.nextInt();
        b=scan.nextInt();
       
        scan.close();
        
        if(a>b) {
        	System.out.println(a+ " is greater than the two numbers");
        }
        
        else {
        	System.out.println(b+" is greater than the two numbers");
        }

	}

}
