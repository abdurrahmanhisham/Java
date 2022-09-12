                                                                                   //CONSTRUCTOR OVERLOAD
 
কন্সট্রাক্টর একটা মেথড । শুধু অন্যান্য মেথড এর সাথে এর পার্থক্য হচ্ছে কন্সট্রাক্টর এর নাম অবশ্যই তার ক্লাসের নামে হবে। যেমন আপনার ক্লাস এর নাম যদি Myclass হয় তাহলে আপনার কন্সট্রাক্টর এর নাম ও Myclass হতে হবে।

জাভাতে কন্সট্রাক্টর  তৈরী করার নিয়ম ঃ
1.ক্লাসের নাম যেটা থাকবে কন্সট্রাক্টরের নাম সেটাই থাকবে.
2.কোনো রিটার্ণ টাইপ থাকবে না.


Main.java:-

public class Main {
public static void main(String[]args){
	Teacher t1= new Teacher("HISHAM","CSE",22);
	t1.display();
}
}

Teacher.java:-

public class Teacher {
String name,dept;
int age;
Teacher(String n,String d,int a){
	name=n;
	dept=d;
	age=a;
}
void display() {
	System.out.println("Name is:- "+name);
	System.out.println("Depaartment:- "+dept);
	System.out.println("Age is:- "+age);
}
}

......................................................................................................................................................................................
Main.java:-

public class Main {
public static void main(String[]args){
	Teacher t1= new Teacher();
	Teacher t= new Teacher ("arh","cse");
	t.display();
	Teacher t2=new Teacher("ASKFJ","CSE",33);
	t2.display();
}
}

Teacher.java:-

public class Teacher{
String name,dept;
int age;
Teacher(){
  System.out.println("No info");
}
Teacher (String m, String i){
    name=m;
    dept=i;
}
Teacher(String n,String d,int a){
	name=n;
	dept=d;
	age=a;
}
void display() {
	System.out.println("Name is:- "+name);
	System.out.println("Depaartment:- "+dept);
	System.out.println("Age is:- "+age);
}
}

......................................................................................................................................................................................

Main.java:-

public class Main {
public static void main(String[]args){
	Teacher t1= new Teacher();
	Teacher t2=new Teacher("ASKFJ","CSE",33);
	t2.display();
}
}

Teacher.java:-

public class Teacher{
String name,dept;
int age;
Teacher(){
  System.out.println("No info");
}
Teacher(String n,String d,int a){
	name=n;
	dept=d;
	age=a;
}
void display() {
	System.out.println("Name is:- "+name);
	System.out.println("Depaartment:- "+dept);
	System.out.println("Age is:- "+age);
}
}
