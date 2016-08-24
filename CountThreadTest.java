/*
 * if no run is there then what?
 * start to run 
 */
public class CountThreadTest extends Thread {
	int from , to;
	int threadCount;
	public CountThreadTest(int threadCount, String name, int from,int to){
		super(name);
		this.from = from;
		this.to = to;
		this.threadCount = threadCount;
	}
	public void run(){
		if (threadCount != 2) {
			yield();
		}
		System.out.println("New thread has started " + threadCount);
		for(int i = from ; i < to ; i++){
			System.out.println("i =" + i);
		}
		System.out.println("Thread has ended " + threadCount);
	}

	public static void main(String args[]){
		for(int i = 0; i<3;i++){
			CountThreadTest t = new CountThreadTest(i, "Shraavya Thread", i*10, (i+1)*10);
			t.setPriority(i + 1);
			t.start();
		}
	}

}
