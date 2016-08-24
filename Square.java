
public class Square extends Shape {
	public Square(int sqSide){
		super(sqSide);
	}
	public void draw(){
		System.out.print("drawing square with"+ super.getNoOfSides());
	}
}
