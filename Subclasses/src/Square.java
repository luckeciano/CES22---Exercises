
public class Square extends Shape {
	private int side;
	Square (String aName){
		super(aName);
		side = 3;
	}
	public float calculateArea(){
		int area;
		area =  side*side;
		return area;
	}

}
