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


public class Test {

	public static void main(String[]args) {
		Student ob=new Student("Hisham","213-15-4270",21);
		ob.show();
		Student ob1=new Student("Arnob","214-15-4270",22);
		ob1.show();
	}
}



............................................................................................................................

public class Student {
 
 static String varsity_name="DIU";


}


public class Test {

	public static void main(String[]args) {
		System.out.println("University name: "+Student.varsity_name);
	}
}




..............................................................

public class Student {
 
	void show() {
		System.out.println("It is Non static method");
	}
	static void display() {
System.out.println("It is static method");

	}
}




public class Test {

	public static void main(String[]args) {
		Student ob=new Student();
		ob.show();
		Student.display();
	}
}


...............................................................................................



public class Student {
 int a=5;
 static int b=8;
 void show() {
	 display();
	 System.out.println(a);
	 System.out.println(b);
 }
 static void display() {
	 System.out.println("Static method.");
	 System.out.println(b);
	 
 }
}






public class Test {

	public static void main(String[]args) {
Student ob=new Student();
ob.show();
Student.display();
	}
}





............................................................................
public class Student {
 static int id;
 static String name;
 
 static void display() {
	 System.out.println("ID:"+id);
	 System.out.println("Name: "+name);
 }


 static {
	 id=123;
	 name="Hisham";
			 System.out.println("Hello World");
 }
}
 



public class Test {

	public static void main(String[]args) {
Student.display();
	}
}





