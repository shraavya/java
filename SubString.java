
public class SubString {
	public static String quotedString(String from,char start, char end)
	{
		int startPos = from.indexOf(start);
		int endPos = from.indexOf(end);
		if(startPos == -1) //no start found
			return null;
		else if(endPos == -1)  // no end found
			{
			System.out.println(startPos);
			return from.substring(startPos);
			}
		else
		{
			System.out.println(startPos);
		System.out.println(endPos);
			return from.substring(startPos, endPos);
		}
	}
	public static void main(String args[]){
		String str;
		str = quotedString("It was a good <Movie!>" , '<' , '>');
		System.out.println("substring is " + str);
	}

}
