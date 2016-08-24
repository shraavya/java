
public class ThreadStarterTest {
public static void main(String args[]){
	ThreadStarter A = new ThreadStarter("A");
	ThreadStarter B = new ThreadStarter("B");
	ThreadStarter C = new ThreadStarter("C");
	ThreadStarter D = new ThreadStarter("D");
	ThreadStarter E = new ThreadStarter("E");
	A.start();
	B.start();
	C.start();
	D.start();
	E.start();
	try{
		A.join();
		B.join();
		C.join();
		D.join();
		E.join();
	}catch(InterruptedException e){
		System.out.println("Exception occured");
	}
	
	System.out.println("Main thread ending");
}
}
