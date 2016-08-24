import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckForSubString {
	public static void main(String Args[]){
		String userInput = null;
		String subStr = null;
		System.out.println("enter a string");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try{
			userInput = b.readLine();
		}catch(IOException e){
			System.out.println("IO Exception has occured");
		}
		System.out.println("enter string to check whether it is present or not");
		try{
			subStr = b.readLine();
		}catch(IOException e){
			System.out.println("IO Exception has occured");
		}finally{
			try{
				b.close();
				i.close();
			}catch(IOException e){
				System.out.println("IO Exception has occured");
			}
		}
		boolean isSubStr = userInput.contains(subStr);
		if(isSubStr){
			System.out.println("yes");
		}
		else{
			System.out.println("no");

		}
		int k = userInput.indexOf(subStr, 0);
		System.out.println(k);
	}
}