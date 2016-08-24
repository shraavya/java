
public class ArrayManipulator {
	public int[] thisArray;
	public ArrayManipulator(int[] array){
		thisArray = array;
	}
	synchronized public int[] decrementAll(){
		for(int i = 0 ; i< thisArray.length; i ++){
			thisArray[i] = thisArray[i] - 1;
		}
		return thisArray;
	}
	synchronized public int[] incrementAll(){
		for(int i = 0 ; i< thisArray.length; i ++){
			thisArray[i] = thisArray[i] + 10;
		}
		return thisArray;
	}
}