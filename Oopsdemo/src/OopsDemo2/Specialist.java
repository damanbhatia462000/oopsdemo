package OopsDemo2;

public class Specialist extends Doctor {
	
	String speciality;
	public Specialist(int idNumber, String name, String address,String sp) {
		super(idNumber, name, address);
		this.speciality=sp;  //Invokes base class Doctor's Constructor
		}
	
	void display() {
		super.display();  //Calls the base class method
		  System.out.println("The speciality is :" + speciality);
	}
}
