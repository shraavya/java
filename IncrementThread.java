
public class IncrementThread extends Thread {
	ArrayManipulator decobj;
	public IncrementThread(ArrayManipulator obj){
		decobj = obj;

	}
	public void run(){
		try {
			for(int i = 0 ; i< 5 ; i++){
				synchronized(decobj){

				decobj.incrementAll();
				}
				sleep(50);
			}
		}catch(InterruptedException e){
			System.out.println("Exception occured");
		}
	}
}
