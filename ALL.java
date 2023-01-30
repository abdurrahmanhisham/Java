                                                                         14-8-2022

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
                        
                                                                         21-8-2022

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

                                                                             28-8-2022

Test.java
........................
public class Test{
    int square1(){
        return 3*3;
    }
    int square2(int n){
        return n+n;
    }
}

Main.java
public class Main
{
	public static void main(String[] args) {
	Test a=new Test();
	System.out.println(a.square1());
	System.out.println(a.square2(5));
	}
}

                                                                          4-9-2022
							  
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


public class Student {
 
 static String varsity_name="DIU";


}

public class Test {

	public static void main(String[]args) {
		System.out.println("University name: "+Student.varsity_name);
	}
}

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



                                                                  25-9-2022

Employee
						
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



Teacher


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
/*
#include<stdio.h>
void aaa(int n){
    if(n%2)
    printf("odd\n");
    else
    printf("even\n");
}
    int main(){
        int a;
        scanf("%d",&a);
        aaa(a);
}
*/
#include<stdio.h>
int sum(int n){
    int sum=0;
    for(int i=0;i<=n;i++){
        sum+=i;
    }
    return sum;
}
int main(){
    int n;
    scanf("%d",&n);
    printf("%d",sum(n));
}
