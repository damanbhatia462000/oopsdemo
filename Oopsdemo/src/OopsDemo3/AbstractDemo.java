package OopsDemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Trainee t1= new Marks("John", "NY", 1001, 35); 	//Up-casting
		
		t1.show();  //invokes base class methods
		
		double marks=t1.calculateMarks();  //invoke sub-class methods
		System.out.println(t1+ " "+marks);
	}

}
