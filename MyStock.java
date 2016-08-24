
public class MyStock {
	private int stockNumber;
	private float price;

	public MyStock setStockNumber(int stockNumber){
		this.stockNumber = stockNumber;
		return this;
	}

	public MyStock setPrice(float price){
		this.price = price;
		return this;
	}

	public int getStockNumber(){
		return stockNumber;
	}

	public float getPrice(){
		return price;
	}

	public static void main(String args[]){
		MyStock x = new MyStock();
		MyStock y = new MyStock();

		x.setStockNumber(123).setPrice(123.23f);
		y.setStockNumber(345).setPrice(345.56f);

		System.out.println(x.getStockNumber()+" "+ x.getPrice());
		System.out.println(y.getStockNumber()+" "+ y.getPrice());

	}

}
