import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Class to print a given string in reverse order
 * @author shraavyasirpa
 *
 */
public class StringReverse {
	// entry point to the class
	public static void main(String Args[]){
		String userInput = null;
		String reversedString = null;
		System.out.println("enter string");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		// Reading input from the user
		try{
			userInput = b.readLine();
		}catch(IOException e){
			System.out.println("IOException has occured");
			e.printStackTrace();
		}finally{
			// closing the input Stream reader and buffered reader
			try{
				b.close();
				i.close();
			}catch(IOException e){
				System.out.println("IOException has occured");
			}
		}
		StringReverse R = new StringReverse();
		reversedString = R.reverseString(userInput);
		int n = reversedString.length();
		for(int j =0  ; j < n ; j++)
		{
			//printing the string in reverse
			System.out.print( reversedString.charAt(j));
		}

	}
//	public String reverseString(String str){
//		String temp = str;
//		StringBuffer temp1 = new StringBuffer(str.length());
//		int n = str.length();
//		for( int i = 0 ; i < n ; i ++){
//			temp1 = temp1.append(str.charAt(n-i-1));
//			
//		}
//		return temp1.toString();
//	}
	public String reverseString(String str){
		String temp = "";
		int n = str.length();
		for( int i = 0 ; i < n ; i ++){
			temp = temp + str.charAt(n - i - 1);
			
		}
		return temp;
	}
}
