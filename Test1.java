
public class Test1 {
	private int num,den;
	public Test1(){
		this(0,5);
	}

	public Test1(int initNum){
		this(initNum,7);
	}
	public Test1(int initNum, int initDen){
		num = initNum;
		if(0 == initDen){
		 den = 1;
		}
		else{
			den = initDen;
		}
	}

public static void main(String args[]){
	Test1 a = new Test1();
	Test1 b = new Test1(2);
	Test1 c = new Test1(3,4);

	System.out.println(a.num+ " "+ a.den);
	System.out.println(b.num+ " "+ b.den);
	System.out.println(c.num+ " "+ c.den);

}
}
