import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReverse {
	public static void main(String args[]){
		String userInput = null;
		String toArrayString[];
		int toArrayNum[] = null;
		int arrayNum[];
		System.out.println("print numbers separated by commas");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try{
			userInput = b.readLine();
			toArrayString = userInput.split(",");
			int n = userInput.split(",").length;
			toArrayNum = new int[n];
			for(int k = 0 ; k < n ; k++){
				toArrayNum[k] = Integer.parseInt(toArrayString[k]);
			}
		}catch(IOException e){
			System.out.println("IO Exception has occured");
		}catch(NumberFormatException m){
			System.out.println("Enter only numbers separated by commas");
		}finally{
			try{
				b.close();
				i.close();
			}catch(IOException e){
				System.out.println("IO Exception has occured");
			}
		}
		arrayNum =  ArrayReverse.ReverseArray(toArrayNum);
		for( int  j = 0 ; j< arrayNum.length ; j++){
			System.out.println(arrayNum[j]);
		}

	}

	public static int[] ReverseArray(int[] array){
		int arrayToReverse[] = array;
		int arrayReversed[] = new int[array.length];
		for(int j = 0 ; j < array.length ; j++){
			arrayReversed[array.length -1 - j] = arrayToReverse[j];
		}

		return arrayReversed;
	}
}
