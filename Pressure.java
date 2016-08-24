
public class Pressure extends Thread{
	static synchronized void raisePressure(){
		if(P.pressureGuage < P.safetyLimit-15){
			try{
				sleep(100);
			}catch(InterruptedException e){


			}
			P.pressureGuage += 15;
		}

	}
	public void run(){
		raisePressure();
	}

}

