import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheNumber {
	public static void main(String args[]){
		String userInput = null;
		float userNum = 0;
		System.out.println("Enter a number to find the nearest factorial to that number");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try {
			userInput = b.readLine();
		} catch(IOException e){
			System.out.println(" IO Exception had occured");
		} 
		try{
		userNum = Integer.parseInt(userInput);
		}catch(NumberFormatException n){
			System.out.println("Enter a valid number");
			return;
		}
		int f = factorial(userNum);
		f = f-1;
		System.out.println(" the value of n such that n! <= num <= (n+1)! is " + f);

	}
	public static int factorial(float num){
		int temp = 1;
		int k;
		for(k=1;;k++){
			temp = temp *k ;
			if (temp>= num)
				return k ;
		}
	}
}
