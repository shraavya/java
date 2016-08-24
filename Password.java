
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {
	public static void main(String Args[]){
		boolean isPassword = true;
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		try {
			do{
				String userInput = null;
				System.out.println("enter a string");
				try{
					userInput = b.readLine();
				}catch(IOException e){
					System.out.println("IO Exception has occured");
					e.printStackTrace();
				}

				if(userInput.length() <= 8){
					System.out.println("Invalid Password Retry");
					isPassword = false;
					continue;
				}
				else if(!isAlphabetSmall(userInput)){
					System.out.println("Invalid Password Retry");
					isPassword = false;
					continue;
				}
				else if(!isAlphabetCaps(userInput)) {
					System.out.println("Invalid Password Retry");			
					isPassword = false;
					continue;
				}
				else if(!isAlphabetNum(userInput)) {
					System.out.println("Invalid Password Retry");
					isPassword = false;
					continue;
				}else if(userInput.contains(" ")){
					System.out.println("Invalid Password Retry");
					isPassword = false;
					continue;
				}else if(!isSpecialChar(userInput)){
					System.out.println("Invalid Password Retry");
					isPassword = false;
					continue;
				}else{
				isPassword = true;
				}
			}while(isPassword == false);
		}finally{
			try{
				b.close();
				i.close();
			}catch(IOException e){
				System.out.println("IOException has occured");
				e.printStackTrace();
			}
		}
	}


	public static boolean isAlphabetSmall(String str){
		boolean tempBoolean = true;
		for(int k = 0; k< str.length(); k++){
			if('a' <= str.charAt(k) && str.charAt(k) <= 'z'){
				tempBoolean = true;
				return tempBoolean;
			}
			else{
				tempBoolean = false;
			}
		}
		return tempBoolean;

	}
	public static boolean isAlphabetCaps(String str){
		boolean tempBoolean = true;
		for(int k = 0; k< str.length(); k++){
			if('A' <= str.charAt(k) && str.charAt(k) <= 'z'){
				tempBoolean = true;
				return tempBoolean;
			}
			else{
				tempBoolean = false;
			}
		}
		return tempBoolean;

	}

	public static boolean isAlphabetNum(String str){
		boolean tempBoolean = true;
		for(int k = 0; k< str.length(); k++){
			if('0' <= str.charAt(k) && str.charAt(k) <= '9'){
				tempBoolean = true;
				return tempBoolean;
			}
			else{
				tempBoolean = false;
			}
		}
		return tempBoolean;

	}
	public static boolean isSpecialChar(String str){
		boolean tempBoolean = true;
		for(int k = 0 ; k< str.length(); k++){
			if (!isAlphabetNum("" + str.charAt(k)) && !isAlphabetSmall("" + str.charAt(k)) && !isAlphabetCaps("" + str.charAt(k))) {
				tempBoolean = true;
				return tempBoolean;
			} else {
				tempBoolean = false;
			}
		}

		return tempBoolean;
	}


}





