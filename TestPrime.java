
public class TestPrime {
public static void main(String args[]){
	if (args.length!= 1){
		System.out.println("usage: java test prime 1027");
	}
	long posPrime = Long.parseLong(args[0]);
	int centuries =  (int)(posPrime/100)+1;
	for(int i =0;i<centuries;i++){
		new TestRange(posPrime,i*100).start();
		System.out.println("starting a thread");
	}
}
}
