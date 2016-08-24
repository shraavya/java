
public class P {
	static int pressureGuage = 0;
	static final int safetyLimit = 20;
	public static void main(String args[]){
		Pressure p1[] = new Pressure[10];
		for(int i =0; i<10 ;i++){
			p1[i] = new Pressure();
			p1[i].start();
		}
		try{
			for(int i =0;i<10;i++){
				p1[i].join();
			}
		}catch(InterruptedException e){
			
		}
		System.out.println("guage reads"+ pressureGuage +"safe limit + s20");
	}
}

