
public abstract class Shape {
	private int noOfSides= 0;
	public Shape(int sides){
		noOfSides = sides;

	}
	public int getNoOfSides(){
		return noOfSides;
	}

	public abstract void draw();
}
