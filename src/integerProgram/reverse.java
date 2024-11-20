package integerProgram;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int i = sc.nextInt();
		int rev=0;
		while(i>0) {
			int rem=i%10;
			rev=10*rev+rem;
			i=i/10;
		}
          System.out.println(rev);
	}
}
