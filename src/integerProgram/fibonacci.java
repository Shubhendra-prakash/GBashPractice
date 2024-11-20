package integerProgram;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter which term of fibonacci series to print: ");
		int n = sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.println(n1+" "+n2+" ");
		int i=1;
		while(i<n-2) {
			int n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
			System.out.println("the"+n+"th term is :"+n3);
			i++;
		}
	}
}
