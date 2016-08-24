
public class FulltimeEmployee extends Employee {
	public FulltimeEmployee(int hr, String ename){
		super(hr, ename);
	}
	
	public int getHoursPerDay(){
		return 8;
	}
}
