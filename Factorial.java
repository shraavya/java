import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String args[]){
		String userInput = null;
		int userInt = 0;
		int temp =1;
		System.out.println("Enter an integer to print its factorial");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try {
			userInput = b.readLine();
		} catch(IOException e) {
			System.out.println("IO Exception has occured");
		}
		try {
			userInt = Integer.parseInt(userInput);
		} catch(NumberFormatException n){
			System.out.println(" Please enter a valid integer");
			return;
		}
		for (int k = 1; k<= userInt ; k++){
			temp = temp*k;
		}
		System.out.println("The factorial of the number " + userInt + " is " + temp);
	}
}
