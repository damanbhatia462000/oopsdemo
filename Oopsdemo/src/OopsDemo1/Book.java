package OopsDemo1;
/*
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
 * To achieve this, you must:
   declare class variables/attributes as private
   provide public get and set methods to access and update the value of a private variable

   The get method returns the value of the variable name.



   The set method takes a parameter (newName) and assigns it to the name variable. 
 */
public class Book {
	//properties

	private int bookId;
	private String BookName;
	private float price;
	private String publisher;

	// Generate Getters & Setters -> Place a cursor in new blank line --> Right Click
	//  --> Source ---> Generate Getters & Setters --> Select All --> Generate

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}


	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}


	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	void display() {
		System.out.println("******Welcome to Regal Book Shop******* ");
	}

	float discountPrice() {
		return ((this.price)-(this.price*10f));
	}

	//Generate toString() method--converts objects to strings 
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", BookName=" + BookName + ", price=" + price + ", publisher=" + publisher
				+ "]";
	}




}
