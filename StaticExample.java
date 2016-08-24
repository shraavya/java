
public class StaticExample {

	public int var = 0;
	
	public StaticExample() {
		var++;
	}
	
	public static void main(String args[]) {
		StaticExample st1 = new StaticExample();
		StaticExample st2 = new StaticExample();
		System.out.println("Var " + st1.var);
	}
}
