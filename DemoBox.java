
public class DemoBox {
public static void main(String args[]){
	Box1 myBox1 = new Box1(10,20,15);
	Box1 myBox2 = new Box1(3,6,9);
	double vol;
	vol = myBox1.volume();
	System.out.println(vol);
	myBox1.toString();
	
	vol = myBox2.volume();
	System.out.println(vol);
}
}
