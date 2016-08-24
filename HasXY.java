
public class HasXY extends HasX{
	private int y;
	public void setY(int inputY){
		y = inputY;
	}
public int getY(){
	return y;
}
public void showY(){
	System.out.println("y is :" + y);
}
public void showX(){
	System.out.println("x is :" + getX());

}

public static void main(String args[]){
	HasXY obj = new HasXY();
	obj.setY(20);
	obj.setx(10);
	obj.showX();
	obj.showY();
}
}
