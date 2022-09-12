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

