package assignments;

class Rectangle{
	int l,b;

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}
	
	public int Area() {
		return l*b;
	}
}
public abstract class TwoRectQFour {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(4, 5);
		Rectangle r2=new Rectangle(5, 8);
		
		System.out.println("The area of the first Rectangle with sides (4,5) is :"+ r1.Area());
		System.out.println("The area of the second Rectangle with sides (5,8) is :"+ r2.Area());
	}

}
