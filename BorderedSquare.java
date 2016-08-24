
public class BorderedSquare extends Square {
	private int sqThickness;
	public BorderedSquare(int sides, int thickness){
		super(sides);
		sqThickness = thickness;
	}
	public void draw(){
		super.draw();
		System.out.print( " with a thickness of " + sqThickness);
	}
	
}
