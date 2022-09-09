Main.java
                                                                                           
public class Main {
public static void main(String[]args) {
	Student ob=new Student();
	ob.name="HISHAM";
	ob.id="213-15-4270";
	ob.age=22;
	ob.display();
}
}

Student.java

public class Student {
String name,id;
int age;
void display() {
	System.out.println(name);
	System.out.println(id);
	System.out.println(age);
}
}
