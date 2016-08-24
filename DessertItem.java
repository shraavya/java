
public abstract class DessertItem {
private String name;
public  DessertItem(String n){
	name = n;
}
public void printTotal(){
	System.out.println("name is of the desset"+ name + "cost of the dessert" );
}

public  abstract int getCost();
}
