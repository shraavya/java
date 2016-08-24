
public class DecrementThread extends Thread {
	ArrayManipulator decobj;
	public DecrementThread(ArrayManipulator obj){
		decobj = obj;

	}
	public void run(){
		try {
			for(int i = 0 ; i< 5 ; i++){
				synchronized(decobj){
				decobj.decrementAll();
				}
				
				sleep(50);
			}
		}catch(InterruptedException e){
			System.out.println("Exception occured");
		}
	}
}
