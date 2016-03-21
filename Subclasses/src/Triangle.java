//Class Triangle
public class Triangle extends Shape {
	private int base;
	private int height;
	Triangle (String aName){
		super(aName);
		base = 3;
		height = 5;
	}
	public float calculateArea(){
		float area;
		area =  (float) (0.5 * base * height);
		return area;
	}

}
