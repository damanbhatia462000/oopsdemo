package basics;
/*
 * Program to display numbers from 1 to 10.
 *
 * Understand the concept of Loop.
 * Loop - A set of statements executing repeatedly , until a particular
 * condition is TRUE.
 */
public class WhileDemo1 {

	public static void main(String[] args) {
		int i=1;

		while(i<=10) {
			System.out.println( i+"Daman");
			i++;
		}
		System.out.println("Exiting the loop now....");


		System.out.println("Reversing the loop now....");

		int j=10;

		while(j>=1) {
			System.out.println(j);

			j=j-1;
		}
	}
}
