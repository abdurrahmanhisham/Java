25-9-22

public class Employee {
 float salary=400000;
}
class Programmer extends Employee{
float bonus=10000;
public static void main(String args[]) {
	Programmer p=new Programmer();
	System.out.println("Programmer salary is:"+p.salary);
	System.out.println("bonus of Programmeris:"+p.bonus);
}
}
