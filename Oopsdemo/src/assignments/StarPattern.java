package assignments;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        
        for (int i=1; i<=rows; i++) 
        { 
            // Print space in decreasing order 
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++) 
            { 
               System.out.print("*"); 
            } 
            System.out.println(); 
        } 
        for (int i=rows-1; i>=1; i--)
        {
         // Print space in increasing order
            for (int j=rows-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            // Print star in decreasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}






/*
*Write a program create a class ‘simpleobject‘. Using constructor display the message.
*/


/*
*3) Write a program to print the names of students by creating a Student class. If no name is 
*passed while creating an object of Student class, then
* the name should be "Unknown", otherwise the name should 
* be equal to the String value passed while creating object of Student class.
*/