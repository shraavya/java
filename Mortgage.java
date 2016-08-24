
public class Mortgage {
public static void main(String args[]){
	//declaration
	double principal;
	double yearlyInterest;
	int years;
	//initialization
	principal = 2000.00;
	yearlyInterest = 0.10;
	years = 5;
	
	// conmputation
	double monthlyInterest = yearlyInterest/12;
	double payment = principal * monthlyInterest/(1-(Math.pow(1/(1+monthlyInterest), years*12)));
	
	// output
	System.out.println("your monthly payment is "+ payment);

}
}
