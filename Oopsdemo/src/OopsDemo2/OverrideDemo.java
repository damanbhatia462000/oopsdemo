package OopsDemo2;

class Bank  //Base class
{
	int getRateofInterest() {
		
		return 0;
	}
	
	void display()
    {
        System.out.println("Welcome to Bank");
    }
}

class SBI extends Bank
{
	int getRateofInterest() 	//Over-ridden method in child class
	{
		return 5;
	}
}
class ICICI extends Bank
{
	int getRateofInterest()
	{
		return 7;
	}
}
class Axis extends Bank
{
	int getRateofInterest() {
		return 6;
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		SBI b1=new SBI();
        ICICI b2=new ICICI();
        Axis b3=new Axis();
       
        b1.display();
        //Invoke overriden method from SBI class
        System.out.println("The Interest Rate of SBI is :"+b1.getRateofInterest());
       
        b2.display();
        System.out.println("The Interest Rate of ICICI is :"+b2.getRateofInterest());
       
        b3.display();
        System.out.println("The Interest Rate of Axis is :"+b3.getRateofInterest());
	}

}
