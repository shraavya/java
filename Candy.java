
public class Candy extends DessertItem{
	private int cweight;
	private int crate;
	public  Candy(String name, int weight , int rate){
		super(name);
		cweight = weight;
		crate = rate;
	}
	
	public int getCost(){
		return  cweight*crate;
	}
	
}
