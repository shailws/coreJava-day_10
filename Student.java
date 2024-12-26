package Day10;

import java.util.Scanner;

public class Student {
	
	public void personal(String name, int age) {
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
	}
	
	public void marks( int math , int bio, int chem) {
		int avg = (math + bio + chem) / 3;
		System.out.print("Average of marks : " + avg);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of student: ");
		String name = sc.nextLine();
		System.out.println("Enter age of student: ");
		int age = sc.nextInt();
		System.out.println("Enter math marks of student: ");
		int math = sc.nextInt();
		System.out.println("Enter biology marks of student: ");
		int bio = sc.nextInt();
		System.out.println("Enter chemistry marks of student: ");
		int che = sc.nextInt();
		
		Student st = new Student();
		st.personal(name, age);
		st.marks(math, bio, che);
	}
}


