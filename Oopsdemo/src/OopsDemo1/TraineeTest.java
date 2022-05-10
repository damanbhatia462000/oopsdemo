package OopsDemo1;

public class TraineeTest {

	public static void main(String[] args) {
		
		Trainee t1=new Trainee(); //Invokes implicit constructor
		t1.display();
		
		Trainee t2=new Trainee(222, "ffff","C++",7000);//Invokes parameterized constructor
		t2.display();
		
		Trainee t3=new Trainee(333, "sss","HTML",4500);//Invokes parameterized constructor
		t3.display();
		
	}

}
