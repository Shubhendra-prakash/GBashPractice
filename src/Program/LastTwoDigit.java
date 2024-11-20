package Program;

import java.util.Scanner;


public class LastTwoDigit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number: ");
		int a = sc.nextInt();
		
		//int div = a%100;
		
		System.out.println("enter the division number: ");
		int div = sc.nextInt();
		
		if(a % div==0)
			System.out.println("the last two digit of "+ a + " is divisible by "+ div);
		else
			System.out.println("the last two digit of "+ a + " is not divisible by "+ div);
	}
}
