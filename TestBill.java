
public class TestBill {
public static void main(String args[]){
	Bill shraavya = new TaxedBill("Shraavya", 20);
	Bill Ashwin = new NoTaxBill("Ashwin", 50);
	shraavya.addItem("ice cream", 4);
	shraavya.addItem("pallilu", 5);
	Ashwin.addItem("vicks", 40);
	Ashwin.addItem("ps3", 80);
	shraavya.printBill();
	Ashwin.printBill();
}
}
 