package OopsDemo1;
import java.util.Scanner;

class BookStore {
	private String bookName;
	private String author;
	private int price;
	private int noOfCopies;
	Scanner sc = new Scanner(System.in);
	public void setBookDetails() {
		System.out.println(">>>>>>>>>>Enter Book Details>>>>>>>>>>");
		System.out.println("Enter Book name,Author name");
		bookName = sc.nextLine();
		author = sc.nextLine();
		System.out.println("Enter the price of the book and no ofcopies available");
		price = sc.nextInt();
		noOfCopies = sc.nextInt();

	}public void showBookDetails() {
		System.out.println(">>>>>>>>>>>>Book Details<<<<<<<<<<<<<<");
		System.out.println("Book name is "+bookName);
		System.out.println("Author of the book is "+author);
		System.out.println("Price of the book is "+price);
		System.out.println("No of copies available for the "+bookName+" is "+noOfCopies);
		System.out.println(".....................................................................");
	}
}
public class BookStoreTest {

	public static void main(String[] args) {
		BookStore book1 = new BookStore();
		BookStore book2 = new BookStore();
		BookStore book3 = new BookStore();
		book1.setBookDetails();
		book1.showBookDetails();
		book2.setBookDetails();
		book2.showBookDetails();
		book3.setBookDetails();
		book3.showBookDetails();

	}

}
