public class Student {
 
 static String varsity_name="DIU";
}

public class Test {

	public static void main(String[]args) {
		System.out.println("University name: "+Student.varsity_name);
	}
}


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
