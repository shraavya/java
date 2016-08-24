
public class ArrayReturnType {
	public int[] returnArray(boolean flag){
		int array1[]= {1,2,3,4,5,6,7};
		int array2[] ={10,20,30,40,50};
		if (flag)
		{ 
			return array1;
		}
		else
		{
			return array2;
		}
	}
	public static void main(String args[]){
		ArrayReturnType x = new ArrayReturnType();
		System.out.println(x.returnArray(true).length);
		System.out.println(x.returnArray(false).length);

	}
}
