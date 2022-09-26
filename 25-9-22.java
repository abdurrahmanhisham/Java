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

................................................................
	public class teacher {
    String designation = "Lecturer", uniName="DIU";
    public void job(){
        System.out.println("Teaching");
    }
}
class cseTeacher extends teacher{
    String mainSubject = "CSE";

    public static void main(String[]args){
        cseTeacher obj=new cseTeacher();
        System.out.println(obj.uniName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.job();
    }
}
