package Program;

import java.util.Scanner;

public class DivibleBy8And12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int a = sc.nextInt();
		int b=8;
		int c=12;
		
		if(a%b==0 && a%c==0) {
			System.out.println("the " + a + " is divisble by " + b + " and " + c);
		}
		else
			System.out.println("the " + a + " is not divisble by " + b + " and " + c);
	}
}
