package assignments;

class Emp{
	String name,address;
	int year;


	public Emp(String name, int year,String address)
	{
		this.name = name;
		this.address = address;
		this.year = year;

	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getYear() {
		return year;
	}


}
public class EmployeeQuestOne {

	public static void main(String[] args) {

		Emp e1=new Emp("Robert", 1994, "64C-WallsStreet");
		Emp e2=new Emp("Sam", 2000, "68D-WallsStreet");
		Emp e3=new Emp("John", 1999, "26B-WallsStreet");

		System.out.println("Name\t\tYear of Joining\t\tAddress");
		System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t\t\t"+e1.getAddress());
		System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t"+e2.getAddress());
		System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t\t\t"+e3.getAddress());
	}

}
