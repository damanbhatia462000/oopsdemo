package assignments;

class Employee
{
	float salary,hrs;


	void getInfo(float salary,float hrs) {
		this.salary=salary;
		this.hrs=hrs;

	}

	void addSal()
	{
		if(salary<500) {
			salary+=10;
		}
	}

	void addWork() {
		if(hrs>6) {
			salary+=5;
		}
	}


	void printSal() {
		System.out.println("Final Salary of the Employee is "+salary+"$");
	}
}

public class EmpQThree {

	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.getInfo(400, 8);
		emp.addSal();
		emp.addWork();
		emp.printSal();

	}

}
