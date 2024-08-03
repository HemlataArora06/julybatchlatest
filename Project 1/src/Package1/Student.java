package Package1;

public class Student {
	int rollno;	
	int age;
	public void display1()
	{
		System.out.println("Welcome to all of you nine meeting");
        System.out.println("once again");
	}
	public void display2()
	{
		System.out.println("Automation is easy");
	}
	public static void main(String[] args) {
		Student Hema=new Student();
		Hema.rollno=07;
		Hema.age=30;
		System.out.println("Roll no is" + Hema.rollno);
		System.out.println("Age" + Hema.age);
		Hema.display1();
		Hema.display2();
	}
	}
	






