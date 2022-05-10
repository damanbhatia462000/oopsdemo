package assignments;

import java.util.Scanner;

class Area
{
	float length,breadth;

	
	public Area(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public float areareturn() 
	{
		return length*breadth;
	}
	
	
}

public class RectAreaQ2 {

	public static void main(String[] args) {
		
		float length,breadth;
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Please enter the length");
		 length=scan.nextFloat();
		 
		 System.out.println("Please enter the breadth");
		 breadth=scan.nextFloat();
		 scan.close();
		 
		 Area a1=new Area(length, breadth);
		 System.out.println("The area of the rectangle is :"+a1.areareturn());
		 
	}

}
