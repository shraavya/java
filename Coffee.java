
public class Coffee extends Thread{
public void run(){
	while(true){
		System.out.println("I like coffee");
		yield();
	}
}
}
