
public class Cookie extends DessertItem {
 private int cnumber ;
 private int crate;
 public  Cookie(String name, int number , int rate){
		super(name);
		cnumber = number;
		crate = rate;
	}
 public int getCost(){
		return  cnumber*crate;
	}
}
