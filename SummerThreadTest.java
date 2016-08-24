
public class SummerThreadTest {
	public static void main(String args[]){
		int[] array1 ={1,2,3,4,5,6,7,8,9,10};
		SummerThread t1 = new SummerThread("Thread 1", 0,5,array1);
		SummerThread t2 = new SummerThread("Thread 2", 5,array1.length,array1);
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			System.out.println("exception occured");
		}
		
		System.out.println(SummerThread.totalSum);
	}
}
