package OopsDemo3;

//rectangle class is implementing shape interface 
public class Rectangle implements Shape {
	private double width;
    private double height;
    
    //generate constructor using fields
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	@Override
	public double getArea() {
		return this.height*this.width;
	}

}
