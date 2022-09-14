                                         //TAKE INPUT IN ARRAY

import java.util.Scanner;
public class Test {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values of the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("The value of the array ["+i+"]: "+arr[i]);
        }
    }
}




                                        //ARRAY INITIALIZE WITHOUT SIZE

public class test {
    public static void main(String[]args)
    {
        int []arr={10,20,30,40,50};
        for (int i : arr) //for(i=0;i<arr.length;i++)
        {
            System.out.println("The value of array: " + i); //+arr[i]
        }
    }
}
