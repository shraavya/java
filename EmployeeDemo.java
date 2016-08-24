
public class EmployeeDemo {
public static void main(String args[]){
	Employee emp = new FulltimeEmployee(35,"Ashwin");
	Employee tempEmp = new InternEmployee(15,"jujubi");
	System.out.println(emp.getName()+emp.getSalary(emp.getHoursPerDay()));
	System.out.println(tempEmp.getName()+tempEmp.getSalary(emp.getHoursPerDay()));
}
}
