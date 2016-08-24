
public class Counted {
	private int value;
	private static int count = 0;
	public Counted(){
		++count;
		System.out.println("creating a counted obj");
		value = -1;
	}
	public void finalize(){
		-- count;
		System.out.println("destroyind a counted obj");

	}
	public static int getCount(){
		return count;
	}

	public Counted setValue(int newValue){
		value = newValue;
		return this;
	}

	public int getVlue(){
		return value;

	}

	public static void main(String Args[]){
		Counted a = new Counted();
		Counted b = new Counted();
		Counted c = new Counted();
		System.out.println("there are"+ Counted.getCount()+ "counted obj");
		Counted d = new Counted();
		System.out.println("there are"+ Counted.getCount()+ "counted obj");
		System.out.println("count "+ count);
		a = null;
		System.gc();
		System.runFinalization();
		System.out.println("there are"+ Counted.getCount()+ "counted obj");
		b.setValue(2);
		c.setValue(2);
		d.setValue(2);
	}

}


