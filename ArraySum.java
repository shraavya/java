import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySum {
	public static void main(String args[]){
		String userInput = null;
		String beforeConvertingToNumber[];
		float sum =0;
		float afterConvertingToNumber[] ;
		System.out.println("Enter a set of numbers separated by a comma");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try{
			userInput = b.readLine();
		}catch(IOException e){
			System.out.println("IO Exception has occured");
			e.printStackTrace();
		}
		beforeConvertingToNumber = userInput.split(",");
		afterConvertingToNumber = new float[beforeConvertingToNumber.length];
		for(int k=0;k<beforeConvertingToNumber.length; k++){
			try {
				afterConvertingToNumber[k] = Float.parseFloat(beforeConvertingToNumber[k]);
			}catch(NumberFormatException n){
				System.out.println("Enter a set of numbers only");
				return;
			}
		}
		for (int j=0;j< afterConvertingToNumber.length;j++)
			sum = sum + afterConvertingToNumber[j];
		System.out.println("XX" + sum);

	}


}
