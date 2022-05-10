package OopsDemo2;

//	Parent class/base class/super class
class Animal{
	String name;  //properties

	public void eat() {    //methods
		System.out.println("I can Eat");
	}
}

//Derived class/child class/Subclass--inherits Animal class
class Dog extends Animal{

	public void display() {
		System.out.println("My name is : "+name);  //name variable is declared in the parent class but also can be used in child class
	}
}

public class SingleInheritanceTest {

	public static void main(String[] args) {
		Dog labrador=new Dog();   // Creating & Initializing object of a subclass
		
		//access fields of super class
		labrador.name="Zimba";
		
		//calling a method of child class
		labrador.display();
		
		//calling a method of super class
		labrador.eat();
		
	}

}
