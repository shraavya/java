import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckOut {
	static String  billItems[] = new String[10];
	static int k =0;
	static InputStreamReader i = new InputStreamReader(System.in);
	static	BufferedReader b = new BufferedReader(i);
	static boolean shouldContinue;

	public static void main(String args[]){
		boolean isContinue;
		String inputChoice = null;


		try{
			do{
				isContinue = true;
				System.out.println("What dessert does the customer want/n Press 1 for Candy /n"
						+ "Plress 2 for Cookie /n Press 3 for IceCream /n Press 4 for Sundea");
				for ( int j =0 ; j<10 ; j++){
					try{
						inputChoice = b.readLine();
					}catch(IOException e){
						System.out.println("IO Exception has occured");
						e.printStackTrace();
					}
					isContinue = menuImplementation(inputChoice, j);
					if(j ==9){
						isContinue = false;
					}
				}
			}while(isContinue);
		}finally{
			try{
				b.close();
				i.close();
			}catch(IOException e){
				System.out.println("IO Exception has occured");
				e.printStackTrace();
			}
		}
	}

	public static boolean  menuImplementation(String menuChoice, int arrayIndex){
		if(menuChoice == "1"){
			String candyName;
			int candyWeight;
			int candyRate;
			candyName = stringInput("Enter name of candy");
			candyWeight = numberInput("Enter weight of candy");
			candyRate = numberInput("enter rate of candy");
			Candy can = new Candy(candyName,candyWeight,candyRate);
			System.out.println(can.getCost());
			 shouldContinue = wantToContinue("Do you want to continue enter Y or N");
			return shouldContinue;

		}
		else if(menuChoice == "2"){
			return shouldContinue;
		}
		else if(menuChoice == "3"){
			return shouldContinue;
		}
		else if(menuChoice == "4"){
			return shouldContinue;
		}
		else{
			System.out.println("Please enter a valid choice");
			return true;
		}
	}

	public static String stringInput(String message){
		System.out.println(message);
		String readInput = null;
		boolean isEmpty =false;
		do {
			try {

				readInput = b.readLine();
				if(readInput.equals("")){
					isEmpty = true;
					continue;
				}
			}catch(IOException e){
				System.out.println("IOException has occured");
				e.printStackTrace();
			}
		}while(isEmpty);
		return readInput;
	}
	public static int numberInput(String message){
		boolean isNumber = true;
		System.out.println(message);
		String temp = null;
		int number = 0;
		do {
			try {

				temp = b.readLine();
				number = Integer.parseInt(temp);
			}catch(IOException e){
				System.out.println("IOException has occured");
				e.printStackTrace();
			}catch(NumberFormatException n){
				System.out.println("enter a valid integer");
				isNumber = false;
				continue;
			}
		}while(!isNumber);
		return number;
	}

	public static boolean wantToContinue(String message){
		System.out.println(message);
		String userChoice = null;
		boolean wrongChoice = false;
		boolean continueChoice = true;
		do
		{
			try{
				userChoice = b.readLine();
			}catch(IOException e){
				System.out.println("IOException has occured");
				e.printStackTrace();
			}
			if(userChoice.equals("Y")){
				continueChoice = true;
			}else if(userChoice.equals("N")){
				continueChoice = false;
			}else {
				wrongChoice =true;
				continue;
			}
		}while(wrongChoice);
		return continueChoice;
	}
}
