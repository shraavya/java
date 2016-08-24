
public class SummerThread extends Thread{
	private int from =0;
	private int to =0;
	static int totalSum;
	int thisArray[];
public SummerThread(String name, int start, int end, int[] array){
	super(name);
	from = start;
	to = end;
	thisArray = array;
}
public void run(){
	int sum =0;
	try{
	for(int i = from ; i<to ; i++){
		sum += thisArray[i];
		System.out.println("sum is "+ sum + " for "+i + " " + getName());
		sleep(100);
		
	}
	}catch(InterruptedException e){
		System.out.println("exception occured");
	}
	totalSum += sum;
}
}
