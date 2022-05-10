package assignments;


class Member
{
	private String name;
	private int age;
	private int phoneno;
	private String add;
	private double sal;
	
	public Member(String name, int age, int phoneno, String add, double sal) {
		this.name = name;
		this.age = age;
		this.phoneno = phoneno;
		this.add = add;
		this.sal = sal;
	}
	
	public void printSal() {
		System.out.println("Name : "+name+" "+"Age: "+age+" "+"Phone Number: "+phoneno+" "+"Address: "+add+" "+"Salary: "+sal+" ");
	}
	
	
}

class EmployeeEmp extends Member{
	
	private String specialization;
	
	public EmployeeEmp(String name, int age, int phoneno, String add, double sal,String spec) {
		super(name, age, phoneno, add, sal);
		this.specialization=spec;
		
	}
	
}

class Manager extends Member{

	private String department;
	public Manager(String name, int age, int phoneno, String add, double sal,String dep) {
		super(name, age, phoneno, add, sal);
		this.department=dep;
	}
	
}
public class MemberQFive {

	public static void main(String[] args) {
		 
		EmployeeEmp e1=new EmployeeEmp("Ramesh", 29, 665441, "Noida", 52220, "It");
		System.out.println("I am an employee");
		e1.printSal();
		
		Manager m1=new Manager("Daksh", 35, 789895, "Haryana", 85000, "Cloud");
		System.out.println("I am an Manager");
		m1.printSal();
	}

}
