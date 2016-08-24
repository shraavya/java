
public class IceCream extends DessertItem {
	private int costOfIceCream;
	public IceCream(String name, int cost){
		super(name);
		costOfIceCream = cost;
	}
	
	public int getCost(){
		return costOfIceCream;
	}

}
