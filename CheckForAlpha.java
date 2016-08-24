import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckForAlpha {
	public static void main(String args[]){
		boolean isString = true ;
		String userInput = null;
		System.out.println("enter string");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try{
			userInput = b.readLine();
		}catch(IOException e){
			System.out.println("IO Exception had occured");
		}finally{
			try{
				b.close();
				i.close();
			}catch(IOException e){
				System.out.println("IO Exception had occured");
			}
		}
		isString = checkForAlphabetMethod(userInput);
		if (isString == true)
			System.out.println("only alphabets");
		else
			System.out.println("has other than alphabets");
	}
	public static boolean checkForAlphabetMethod(String s){
		boolean isString = true;
		for(int i = 0 ; i < s.length() ; i++){
			if( ('a' <= s.charAt(i) &&  s.charAt(i)<= 'z') || ('A' <= s.charAt(i) && s.charAt(i) <= 'Z' )){
				continue;
			}
			else {
				isString =false;
				return isString;
			}

		}
		return isString ;
	}
}

