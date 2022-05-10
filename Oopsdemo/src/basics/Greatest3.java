package basics;

import java.util.Scanner;

public class Greatest3 {

	public static void main(String[] args) {
		int a,b,c;
        Scanner scan=new Scanner(System.in);
       
        System.out.println("Enter 3 Numbers :");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        scan.close();
        
        if(a>b && a>c) {
        	System.out.println(a+ " is greatest of all the three numbers");
        }
        
        else if(b>c) {
        	System.out.println(b+" is the greater of the three numbers");
        }
        else if(a==b && b==c) {
        	System.out.println("all the numbers are equal");
        	
        }
        else {
        	System.out.println(c+" is the greatest of the three numbers");
        }

	}

}
