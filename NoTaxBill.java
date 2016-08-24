
public class NoTaxBill extends Bill{
	private int discount;
	public NoTaxBill(String name ,int dis){
		super(name);
		discount = dis;
	}
	public void printBill(){
		super.printBill();
		int amt = 0;
		int lenght = super.getLenght();
		for(int l = 0 ; l < lenght; l++){
			amt = amt + super.getAmount(l);
		}
		int totalAmt = amt - discount;
		
		System.out.println("total "+ amt);
		System.out.println("discount"+ discount);
		System.out.println("total with discount "+ totalAmt);
	
}
}