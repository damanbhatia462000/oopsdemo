package OopsDemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		
		Address ad1=new Address("Bengaluru", "Karnataka", "India", 77777);
		Address ad2=new Address("Delhi", "New Delhi", "India", 110015);
		
		Student s1=new Student(101, "Ravi", ad1);
		Student s2=new Student(101, "Ravi", ad2);
		
		s1.display();
		s2.display();
	}

}
