                                                       //scanner 

import java.util.Scanner;
public class Sum {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the first number:-");
	int a=input.nextInt();
	System.out.println("Enter the second number:-");
	int b=input.nextInt();
	System.out.println("The sum of two numbers:-"+(a+b));
}
}

                                                     //scanner product

import java.util.Scanner;
public class Sum {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the first number:-");
	double a=input.nextDouble();
	System.out.println("Enter the second number:-");
	double b=input.nextDouble();
	System.out.println("Enter the third number:-");
	double c=input.nextDouble();
	System.out.println("The product of three numbers:-"+(a*b*c));
}
}

                                                   //MATH

public class Test {
public static void main(String[]args) {
	System.out.println(Math.sqrt(16));
	System.out.println(Math.abs(-40.2));
	System.out.println(Math.pow(3,3));
	System.out.println(Math.PI);
	System.out.println(Math.min(4,2));
	System.out.println(Math.max(4,2));
	System.out.println(Math.floor(2.6));
	System.out.println(Math.ceil(2.4));
	System.out.println(Math.exp(1));
	System.out.println(Math.round(4.2));
	System.out.println(Math.random());
}
}

                                           //SCAN NAME,ID,DEPT

import java.util.Scanner;
public class test {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name: ");
        String a= input.next();
        System.out.println("Enter age: ");
        int b= input.nextInt();
        System.out.println("Enter cgpa: ");
        double c= input.nextDouble();
        System.out.println("Enter dept: ");
        String d= input.nextLine();
        System.out.println("Name: "+a);
        System.out.println("age: "+b);
        System.out.println("cgpa: "+c);
        System.out.println("dept: "+d);

    }
}


import java.util.Scanner;
public class Test{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array:-");
		int size=input.nextInt();
		int[]arr=new int [size];
		System.out.println("Enter the value of the array:-");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
			for(i=0;i<size;i++) {
				System.out.println("Enter the value of array["+i+"]:-"+arr[i]);
			}
		}
	}
}

