
public class ThreadStarter extends Thread {
	public ThreadStarter(String name){
		super(name);
	}
	public void run(){
		try {
			for(int i = 0; i< 5; i++){
				System.out.println("I am thread" + getName());
				sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("exception occured");
		}
	}
}
