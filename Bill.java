
public class Bill {
	private String name;
	private String bitem[] = new String[100];
	private int bamount[] = new int[100];
	private  int k =0 ;
	public Bill(String n){
		name = n;
	}
	public void addItem(String item , int amount){
		bitem[k] = item;
		bamount[k] = amount;
		k++;
	}
	public void printBill(){
		System.out.println("Bill for "+ name);
		System.out.println("Items");
		for(int i = 0; i<k ; i++){
			System.out.println( (i+1) +". "+bitem[i]+" " + bamount[i]);
		}

	}
	
	public int getAmount(int i){
		return bamount[i];
	}
	public int getLenght(){
		return bamount.length;
	}
}
