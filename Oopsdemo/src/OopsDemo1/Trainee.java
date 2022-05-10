package OopsDemo1;
//program to generate constructors
//generate constructors: right click- source-generate constructor

public class Trainee {
	private int id;
	private String name,tech;
	private double stipend;
	
	public Trainee() {
		System.out.println("Implicit Constructor");
		this.id=111;
		this.name="Rrrrr";
		this.tech="Java";
		this.stipend=5000;
	}

	public Trainee(int id, String name, String tech, double stipend) {
		System.out.println("Parameterized constructor");
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	
	void display() {
		System.out.println("******* Trainee Details*********");
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+ this.stipend);
		System.out.println("---------------------------------------------");
			
	}
	
	
}

