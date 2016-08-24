import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	public static void main(String Args[]){
		String userInput = null;
		boolean isplaindrome = false;
		System.out.println("enter a string");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try{
			userInput = b.readLine();
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
		Palindrome p = new Palindrome();
		isplaindrome = p.checkForPlaindrome(userInput);
		if(isplaindrome){
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
	public boolean checkForPlaindrome(String str){
		String temp = str;
		int n = temp.length();
		boolean tempBoolean = true;
		for( int j=0 ; j < n ; j++){
			if (str.charAt(j ) != str.charAt(n-j-1)){
				tempBoolean = false;
				return tempBoolean;
			}
		}
		return tempBoolean;
	}
}
