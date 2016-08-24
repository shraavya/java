
public class ArrayManipulatorTest {
public static void main(String args[]){
	int arrayhere[] = {100,200,300,400,500,600};
	ArrayManipulator newArray = new ArrayManipulator(arrayhere);
	DecrementThread decth = new DecrementThread(newArray);
	IncrementThread incth = new IncrementThread(newArray);
	decth.start();
	incth.start();
	try{
		decth.join();
		incth.join();
	}catch(InterruptedException e){
		
	}
	for(int i = 0 ; i<arrayhere.length;i++){
		System.out.println(arrayhere[i]);
	}
}
}
