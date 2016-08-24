
public class ThisExample {
	String l;
	int a;
	public ThisExample() {
		this("Empty String");
		a = 2;
	}
	
	public ThisExample(String l) {
		this.l = l;
		a = 3;
	}
	
	public static void main(String args[]) {
		ThisExample t = new ThisExample();
		System.out.println("" + t.a);
	}
}
