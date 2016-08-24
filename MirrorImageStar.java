import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MirrorImageStar {
	public static void main(String args[]){
		String userInput = null;
		int userInt = 0;
		int k =1, j=1;
		System.out.println(" Enter a number to print the stars in increasing order until that number");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try {
			userInput = b.readLine();
		} catch(IOException e){
			System.out.println("IO Exception has occured");
		} catch(NumberFormatException n){
			System.out.println("Enter a valid number");
			return;
		}
		userInt = Integer.parseInt(userInput);
		for (k=1 ; k<= userInt; k++){
			for(j=1; j <= userInt - k;j++){
				System.out.print(" ");
			}
			System.out.print("*");
		}

	}
}
