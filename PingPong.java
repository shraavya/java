
public class PingPong extends Thread {
	String word;
	int delay;
	PingPong(String whattosay, int delaytime){
		word = whattosay;
		delay = delaytime;
	}
	public void run(){
		try{
			for(;;){
				System.out.println(word+" ");
				sleep(delay);
			}
		}catch(InterruptedException e){
			return;
		}
	}
	
	public static void main(String args[]){
		new PingPong("Ping",33).start();
		new PingPong("pong",100).start();
		new PingPong("its just a game",200).start();
		
	}
}

