package assignments;

class RectangleRec {
    private double length;
    private double breadth;

    public RectangleRec(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void area() {
        System.out.println("The area is: "+breadth * length);
    }

    public void perimeter() {
        System.out.println("The perimeter is :"+2 * (breadth + length));
    }
}

class Square extends RectangleRec {
	
    public Square(double side) {
        super(side, side);
    }
}


public class AreaPerimeterQSix {

	public static void main(String[] args) {
		 RectangleRec rectangle1 = new RectangleRec(10, 5);
	        RectangleRec square = new Square(10);
	        rectangle1.area();
	        rectangle1.perimeter();
	        System.out.println();
	        square.area();
	        square.perimeter();
	}

}
