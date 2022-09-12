                                                      //EXCLUSIVE TEST CASTING

import java.util.Scanner;
public class test {
    public static void main(String[]args)
    {
        double d=100.04;
        int i=(int)d;                             //needed only when going from bigger data type to smaller data type (otherwise it's called auto-conversion)
        System.out.println("Double value "+d);    //precedence:
        System.out.println("Integer value "+i);   //double > float > long > int > short > byte
    }
}
