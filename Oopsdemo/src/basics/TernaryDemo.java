package basics;
/* 
 * Ternary Operator is the conditional operator that takes 3 operands
 * It is used in place of if else
 * Syntax-  variable= expr1 ? expr2 : expr 3*/


// Program to find the max of 2 nums 
public class TernaryDemo {

	public static void main(String[] args) {
		int a=10, b=20, max;
		
		System.out.println("The first number is " +a);
		System.out.println("The second number is " +b);
		
		max=(a>b) ? a:b;
		
		System.out.println("The max number is " +max);

	}

}
