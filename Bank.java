package Day10;

import java.util.Scanner;

class OpenAccount{
	public void personal(String name, float age) {
		System.out.println("Name of account holder: " + name);
		System.out.println("Age is : " + age);	
	}
}

class Credit{
	public void add(double money) {
		System.out.println("Credited money: "+ money);
	}
}

class Debite{
	public void take(double money) {
		System.out.println("Debited money: "+ money);
	}
}

class CurrentBalence{
	public void bal(double money) {
		System.out.println("Current Balace : "+ money);
	}
}

public class Bank {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age : ");
		float age = sc.nextFloat();
		
		System.out.println("Credit some money in your account : ");
		double money1 = sc.nextDouble();
		
		System.out.println("Debite some money from your account : ");
		double money2 = sc.nextDouble();
		
		double currbal = money1 - money2;
		
		
		
		OpenAccount op = new OpenAccount();
		op.personal(name, age);
		 Credit cr = new  Credit();
		 cr.add(money1);
		 Debite deb = new Debite();
		 deb.take(money2);
		 CurrentBalence cb = new CurrentBalence();
		 cb.bal(currbal);
	}
}
