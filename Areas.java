package Day10;

import java.util.Scanner;

class Circle{
	public void area_circle(double rad) {
		double area = 3.14* rad * rad;
		System.out.println("Area of circle is : "+ area);
	}
}

class Trangle{
	public void area_triangle(double peri_height, double base) {
		double area = (peri_height * base)/2;
		System.out.println("Area of triagle : "+ area);
	}
}

class Rectangle{
	public void area_rectangle(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of rectangle : "+ area);
	}
}

public class Areas {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle :");
		double rad = sc.nextDouble();
		System.out.println("Enter perimeter height of triagle :");
		double peri = sc.nextDouble();
		System.out.println("Enter base of triangle :");
		double base = sc.nextDouble();
		System.out.println("Enter length of rectangle :");
		double length = sc.nextDouble();
		System.out.println("Enter breadth of rectangle :");
		double breadth = sc.nextDouble();
		
		Circle cr = new Circle();
		Trangle tr = new Trangle();
		Rectangle rec = new Rectangle();
		
		cr.area_circle(rad);
		tr.area_triangle(peri, base);
		rec.area_rectangle(length, breadth);
		
		
	}
}

