package OopsDemo3;

import com.wipro.training.microsoft.OperatingSystem;
import com.wipro.training.oracle.Database;

//Demonstrate the use of packages 
public class SoftwareList {

	public static void main(String[] args) {
		
		Database d1=new Database();
		d1.printSoftware();
		System.out.println("-*-*-*-*-*-*-*-*-*-*");
		
		OperatingSystem os=new OperatingSystem();
		os.listSoftware();
	}

}
