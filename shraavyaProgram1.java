import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class shraavyaProgram1 {
	public static void main(String args[]){
		String s1 = null;
		String s2 = null;
		System.out.println("Enter First Name");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader (i);
		try{
			s1 = b.readLine();
		} catch(IOException e){
			System.out.println("IOException has occured");
			e.printStackTrace();
		}
		System.out.println("Enter Last Name");
		InputStreamReader i1 = new InputStreamReader(System.in);
		BufferedReader b1 = new BufferedReader (i1);
		try{
			s2 = b1.readLine();
		} catch(IOException e){
			System.out.println("IOException has occured \n");
			e.printStackTrace();
		}
		
		System.out.println("My name is " + s1 + " " + s2);
		
	}
}
