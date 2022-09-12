public class test {

	public static void main(String[] args) {
		Student ob=new Student();
		ob.show(); //for non-static method object needs to be created first
		Student.display(); //static metods can be directly called with class
	}
}

class Student {

	void show() {
		System.out.println("It is a non-static method");
	}
	static void display() {
		System.out.println("It is a static Method");
	}
}
