import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public float radius;

	public float Area(){
		float area;
		area = 3.14f * radius * radius;
		return area;
	}
	public float Circumfrence(){
		float cirum;
		cirum = 2* 3.14f * radius;
		return cirum;
	}
	public static void main(String args[]){
		float a1;
		float c1;
		Circle C = new Circle();
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try{
			C.radius = Float.parseFloat(b.readLine());
		}catch(IOException e) {
			System.out.println("IO Exception has occured");
			e.printStackTrace();
		}
		a1 = C.Area();
		c1 = C.Circumfrence();
		System.out.println("area of the circle with radius " + C.radius + " is " + a1 );
		System.out.println("Circumference of the circle with radius " + C.radius + " is " + c1 );


	}
}
