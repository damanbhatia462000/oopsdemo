package basics;
//Java program to demonstrate 2D arrays 
public class MatrixDemo {

	public static void main(String[] args) {
		//declare 2d arrays/matrix
		int a[][]= { {11,22,33},
				     {22,33,44},
				     {77,11,66}
				   };
		
		int b[][]= {{44,11,22},
			     	{22,33,44},
			     	{11,22,33}
			   	   };
		
		int c[][]= new int[3][3]; //matrix with 3 rows and 3 columns 
		
		//addition of 2 matrices
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] + b[i][j]; //add 2 matrices
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
