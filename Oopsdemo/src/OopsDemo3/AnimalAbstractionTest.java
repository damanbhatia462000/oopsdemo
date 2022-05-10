package OopsDemo3;

abstract class Animal
{
	public void eat()
	{
		System.out.println("I can eat");
	}
	
	abstract void makeSound();		//abstract method--without body
	
}

class Dog extends Animal
{

	@Override		//@--annotation
	void makeSound() {
		System.out.println("bark bark");
	}
	
}

class Cat extends Animal
{

	@Override
	void makeSound() {
		System.out.println("Meow Meow");
	}
	
}
public class AnimalAbstractionTest {

	public static void main(String[] args) {
		
		//Animal a=new Animal();
		//--Compiler error, cannot create instance of the abstract class
		
		Dog d1=new Dog();
		
		d1.eat();
		d1.makeSound();
		
		
		Cat c1=new Cat();
		
		c1.eat();
		c1.makeSound();
	}

}
