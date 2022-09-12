public class Test {

	public static void main(String[]args) {
		Student ob=new Student("Hisham","213-15-4270",21);
		ob.show();
		Student ob1=new Student("Arnob","214-15-4270",22);
		ob1.show();
	}
}

public class Student {
 String name,id;
 int age;
 static String varsity_name="DIU";
 Student(String n,String i,int a){
	 name=n;
	 id=i;
	 age=a;	 
 }
void show() {
	System.out.println("Name:- "+name);
	System.out.println("ID:- "+id);
	System.out.println("Age:- "+age);
	System.out.println("Varsity:- "+varsity_name);
}
}
