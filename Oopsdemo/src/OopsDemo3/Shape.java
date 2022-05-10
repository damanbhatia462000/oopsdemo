package OopsDemo3;

public interface Shape {
	
	//implicitly public, static and final
    public String LABLE="Shape"; //constant
    
    //interface methods are implicitly abstract and public
    void draw();
    
    double getArea();
}
