Main.java
......................
public class Main
{
	public static void main(String[] args) {
	Test a=new Test();
                    int result=a.square1();
	System.out.println(result);

Test.java
.................
public class Test{
    int square1(){
        return 3*3;
    }
}


......................................................................................................................................................................................
Main.java
public class Main
{
	public static void main(String[] args) {
	Test a=new Test();
	System.out.println(a.square1());
	System.out.println(a.square2(5));
	}
}

	
Test.java
public class Test{
    int square1(){
        return 3*3;
    }
    int square2(int n){
        return n+n;
    }
}
