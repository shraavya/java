
public class FinallyExample {
	public static void main(String args[]) {
		System.out.println("Hello");	
		try {
			System.out.println("Inside try");
			funct();
			System.out.println("getting out of try");
			return;
		} catch (Exception e) {
			System.out.println("Exception occurred");
			return;
		} finally {
			System.out.println("Finally");
		}
	}
	
	private static void funct() {
		throw new IllegalArgumentException();
	}
}
