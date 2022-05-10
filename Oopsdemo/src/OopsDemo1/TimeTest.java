package OopsDemo1;

public class TimeTest {

	public static void main(String[] args) {
		Time t1=new Time(12,45,55);  //Invoke the constructor and initialise the values
		Time t2=new Time(10,30,30);

		t1.add(t2); //Invoking add() mehthod & pass t2 object as argument

		System.out.println("The addition of two times is:");

		t1.display();

	}

}
