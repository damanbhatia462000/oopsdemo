package OopsDemo1;
//program to demonstrate constructors in Java 
//Constructors are used for automatic initialization of the object

class Language{
	private String s;
	private int version;
	
	Language()  //Implicit Constructor/No ARgs constructor
	{
		System.out.println("I am an implicit Constructor");
		s="python";
		System.out.println("Hello from :" +s);
	}
	
	Language(String lang) //Parameterized constructor/constructor with 1 argument
	{
		System.out.println("I am a parameterized constructor");
		this.s=lang;
		System.out.println("Hello from"+s);
	}
	
	Language(String lang, int ver){
		System.out.println("I am a parameterized constructor with 2 arguments");
		this.s=lang;
		this.version=ver;
		System.out.println("Hello from : "+s+ "V"+ version);
		
	}
}
public class LanguagesDemo {

	public static void main(String[] args) {
		Language l1= new Language();//Automatically invokes the implicit constructor without calling it
		Language l2= new Language("Ruby");  //Automatically invokes the parameterized constructor without calling it
		Language l3= new Language("C++"); 
		Language l4= new Language(); 
		Language l5= new Language("Html ",5);//Automatically invokes the 2 args parameterized constructor without calling it
	}
	
	

}
