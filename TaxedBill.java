
public class TaxedBill extends Bill {
	private int bTaxPercentage = 0;
	public TaxedBill(String name , int percentage){
		super(name);
		bTaxPercentage = percentage;

	}
	public void printBill(){
		super.printBill();
		int amt = 0;
		int lenght = super.getLenght();
		for(int l = 0 ; l < lenght; l++){
			amt = amt + super.getAmount(l);
		}
		double tax = (double) amt*bTaxPercentage/100;
		double totalAmt = tax + amt;
		
		System.out.println("total "+ amt);
		System.out.println("tax "+ tax);
		System.out.println("total with tax "+ totalAmt);
		
	}
}
