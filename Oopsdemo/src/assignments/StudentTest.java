package assignments;

public class StudentTest {

	public static void main(String[] args) {
		Student s= new Student("xyz");
		Student s1= new Student("abc");
		Student a=new Student();
		
		
		System.out.println(s.studentname);
		System.out.println(s1.studentname);
		System.out.println(a.studentname);
	}

}
