
public class SortString {
	public static void main(String args[]){
		String students[] = { "kim","ken","Tom","Kathy","Brad"};
		int i ;
		System.out.println("Before sort");
		for(i=0;i<5;i++)
		{
			System.out.println(students[i]);
		}
		sortString(students, students.length);
		System.out.println("After sort");
		for(i=0;i<5;i++)
		{
			System.out.println(students[i]);
		}

	}
	public static void sortString(String array[],int len)
	{
		int a,b;
		String temp;
		int highSubscript = len-1;
		for ( a =0 ; a<highSubscript ; ++a)
			for ( b =0 ; a<highSubscript ; ++b)
				if(array[b].compareTo(array[b+1]) > 0){
					temp = array[b];
					array[b] = array[b+1];
					array[b+1] = temp;

				}
	}
}
