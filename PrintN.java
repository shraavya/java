import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintN {
	public static void main(String args[]){
		String userInput = "";
		int num = 0;
		String words[] ;
		System.out.println("Enter any sentence");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try{
			userInput = b.readLine();

		}catch(IOException e){
			System.out.println("IO exception has occured");
			e.printStackTrace();
			return;
		}

		System.out.println("Enter any number");
		try {
			String temp = b.readLine();
			num = Integer.parseInt(temp);
		} catch(IOException e){
			System.out.println("IO exception has occured");
			e.printStackTrace();
			return;
		} catch(NumberFormatException n){
			System.out.println("Enter a valid number");
			return;
		} finally{
			try{
				b.close();
				i.close();
			}catch(IOException e){
				System.out.println("IO exception has occured");
				e.printStackTrace();
				return;
			}
		}
		int n = userInput.split(" ").length;
		words = new String[n];
		words = userInput.split(" ");
		for(int j = 0 ; j< n ; j++){
			if(num == words[j].length()){
				System.out.println(words[j]);
			}
		}
		

	}
}
