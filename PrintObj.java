
public class PrintObj {
public final static Integer NoOfTests = 2;
String name;
int age;
String courseGrade;
public PrintObj(String StudentName, int sAge,String SGrade){
	name = StudentName;
	age = sAge;
	courseGrade = SGrade;
}
public PrintObj(String sName){
	name =sName;
}
public String toString(){
	return name;
}

public static void main(String args[]){
	PrintObj aStudent;
	aStudent = new PrintObj("Smith",25,"A-");
	System.out.println("Testing.."+ aStudent); // Implicit toString
	System.out.println("Testing..."+ aStudent.toString()); // Explicit toString
	System.out.println(aStudent.name + aStudent.age + aStudent.courseGrade); // Simple data type hence toString is not called
}
}
