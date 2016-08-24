
public class Car extends Vehicle {
	private static final int Number_OF_WHEELS = 4;
	private int passengers;
	public Car(int p , int r){
		super(Number_OF_WHEELS, r);
		passengers = p;
	}
	
	public String toString(){
		return(super.toString()+"passengers"+passengers);
	}
}
