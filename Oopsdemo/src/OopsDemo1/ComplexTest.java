package OopsDemo1;

public class ComplexTest {

	public static void main(String[] args) {
		
		Complex c1=new Complex(10.3,67.4); //invokes constructor
		Complex c2=new Complex(0.7,3.6); //invokes constructor
		
		c1.add(c2);  //calls method add() by passing c2 object
		
		//c3=c1+c2;
		
		System.out.println("The addition of the two complex numbers is :");
		c1.display();
	}

}
