package OopsDemo2;
//program to implement single inheritance
public class AccountantTest {

	public static void main(String[] args) {
		Accountant ac1=new Accountant(201, "Gaurav", "process of salary of employees", "SAP");
		Accountant ac2=new Accountant(205,"Mary John","Payment to Vendors","Tally");
		
		ac1.print();
		ac2.print();
	}

}
