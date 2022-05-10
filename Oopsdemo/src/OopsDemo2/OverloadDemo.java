package OopsDemo2;

//Static polymorphism
public class OverloadDemo {

	public static void main(String[] args) {
		Addition a1=new Addition();
		
		//invoking add() overload method
		a1.add();
		a1.add(10, 20);
		a1.add(34.75f, 542.67f);	//type promotion(method in addition has double but we are passing float values thus type promotion)
		a1.add(300, 400, 500);
		a1.add("Hello", "world");
	}

}
