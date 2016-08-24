import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySameSum {
public static void main(String args[]){
	int temp = 0;
	String beforeConvertingToNumber[];
	int afterConvertingToNumber[];
	System.out.println("enter numbers separated by comma for sum of number to be equal to 10");
	String userInput = null;
	InputStreamReader i = new InputStreamReader(System.in);
	BufferedReader b = new BufferedReader(i);
	try{
		userInput = b.readLine();
	}catch(IOException e){
		System.out.println("IO Exception has occured");
	}
	beforeConvertingToNumber = userInput.split(",");
	afterConvertingToNumber = new int[beforeConvertingToNumber.length];
	for (int k=0;k<beforeConvertingToNumber.length;k++){
		afterConvertingToNumber[k] = Integer.parseInt(beforeConvertingToNumber[k]);
	}
	for (int j=0;j< afterConvertingToNumber.length;j++){
		for(int l=0;l< afterConvertingToNumber.length;l++){
			temp = afterConvertingToNumber[l] + afterConvertingToNumber[j];
			if(temp == 10 && l != j)
				System.out.println(" sum of "+afterConvertingToNumber[l]+"and" + afterConvertingToNumber[j]+ "is 10" );

		}
	}
}
}
