package OopsDemo2;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Developer d1=new Developer(101,"Rayan","Java"); //Invokes derived class constructor
		Developer d2=new Developer(102,"Mayan","C++");
		Developer d3=new Developer(103,"Kayan","Python");
		
		d1.display(); //child class object invokes parent class methods
		d1.display1(); //child class object invokes child class methods
		
		d2.display();
		d2.display1();
		
		d3.display();
		d3.display1();
		}

}
