package OopsDemo2;
import java.util.List;
//Composition Example
public class Library {
	
	List<Book> books; //Object Reference--Composition
	
	
	//constructor to initialize books in a library
	public Library(List<Book> books) {
		this.books=books;
	}

	//getter() methods to get books in a library
	public List<Book> getBooks() {
		return books;
	}
	
}
