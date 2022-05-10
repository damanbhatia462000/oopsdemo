package OopsDemo2;

//child class -Is A relationship
public class Developer extends Employee
{
	String technology;
	public Developer(int empId, String name,String tech) {
		super(empId, name);  //calls employee base class constructor
		this.technology=tech;
		
	}

	void display1()
    {
        System.out.println("Technology Used: "+technology);
    }
	
	
}
