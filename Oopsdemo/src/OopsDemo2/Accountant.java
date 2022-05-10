package OopsDemo2;
//child class derived from Employee parent class

public class Accountant extends Employee {
	String task,tech;
	public Accountant(int empId, String name,String task,String tech) {
		super(empId, name);
		this.task=task;
		this.tech=tech;
		
	}

	void print()
    {
		super.display();  // invokes employee base class display() method
        System.out.println("Accountant Task :"+task);
        System.out.println("Softwares used :"+tech);
    }
}
