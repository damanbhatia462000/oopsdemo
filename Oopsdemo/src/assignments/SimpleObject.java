package assignments;

class SimpleObject1{

	public SimpleObject1() {
		System.out.println("I am an implicit constructor with no args");
		System.out.println("*****************");

	}

	public SimpleObject1(int a) {
		System.out.println("I am a parameteriezed constructor with 1 argument");
		System.out.println("Input values :"+a);
		System.out.println("*****************");
	}

	public SimpleObject1(int b, int c) {
		System.out.println("I am a parameteriezed constructor with 2 arguments");
		System.out.println("Input values :"+b+" "+c);
		System.out.println("*****************");
	}
}

public class SimpleObject {

	public static void main(String[] args) {

		new SimpleObject1();
		new SimpleObject1(10);
		new SimpleObject1(10,20);


	}

}
