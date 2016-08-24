
public class Sundea extends IceCream{
	private int toppingCost;
	public Sundea(String name, int ccost, int topCost){
		super(name , ccost);
		toppingCost = topCost;
	}
	public int getCost(){
		return (toppingCost + super.getCost());
	}

}
