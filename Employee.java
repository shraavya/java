
public class Employee {
	private int hourRate;
	private String name;
	int days;
	public Employee(int hr, String ename){
		hourRate = hr;
		name = ename;
	}

	public int getTotalDaysInMonth(){
		days = 22;
		return days;
	}
	public int getHoursPerDay(){
		return 0;
	}
	public double getSalary(int hours){
		return hourRate*getTotalDaysInMonth()*hours;
	}
	public String getName(){
		return name;
		}
}
