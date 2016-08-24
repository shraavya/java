
public class TestRange extends Thread {
static long PosPrime;
long from, to;
TestRange(long argPosPrime,int argFrom){
	PosPrime = argPosPrime;
	if(argFrom ==0)
		from =2;
	else 
		from = argFrom;
	to = argFrom + 99;
}
public void run(){
	for(long i = from ; i< to && i<PosPrime;i++){
		if(PosPrime %i ==0){
			System.out.println("factor found"+  i+"thread name "+ getName());
			this.stop();
		}
		yield();
	}
}
}
