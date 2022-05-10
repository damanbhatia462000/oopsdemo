package OopsDemo2;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		AccountDetails ad1=new AccountDetails(11, "Ramesh", 1000, 5000, 2000, 1000);
		AccountDetails ad2=new AccountDetails(15, "Sureesh", 15000, 7000, 2850, 85600);
		
		ad1.display();  // invokes display method of AccountDetails
		ad2.display();
	}

}
