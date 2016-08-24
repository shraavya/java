
public class Shortcircuit {
	public static void main(String args[]) {
		int x=0,y=0;
		String direction = "left";
		switch(direction){
		case "up" :
			y=y+1;
			break;
		case "down" :
			y=y-1;
			break;
		case "right" :
			x= x+1;
			break;
		case "left" :
			x= x-1;
			break;
		default :
			System.out.println("no change");
		}

		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
	}
}