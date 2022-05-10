package assignments;

public class Room {

	int roomno;
	String roomtype;
	float roomarea;
	boolean ACmachine;
	
	
	void setData(int roomno,String roomtype,float roomarea,	boolean ACmachine) {
		this.roomno=roomno;
		this.roomtype=roomtype;
		this.roomarea=roomarea;
		this.ACmachine=ACmachine;
	}
	
	void displayData() {
		System.out.println("The Room Number is: "+roomno);
		System.out.println("The Room Type is: "+roomtype);
		System.out.println("The Room Area is: "+roomarea+" m sq.");
		//System.out.println("The Room is AC or Not"+ ACmachine);
		String s=(ACmachine)?"yes":"no";
		System.out.println("Is the room AC: "+ s);
		
	}

	public static void main(String[] args) {
		Room room1=new Room();
		room1.setData(101, "two bedroom", 1500, true);
		
		room1.displayData();
	}

}
