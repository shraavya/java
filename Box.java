
public class Box {
	public float length;
	public float width;
	public float height;


	public float volume ( ){

		float volume;
		volume = length * width * height ;
		return volume;	
	}
	public static void main(String args[]){
		float v1;
		Box b1 = new Box();
		b1.length = 2;
		b1.height = 3;
		b1.width = 4;
		v1 = b1.volume();
		System.out.println( v1);
	}
}