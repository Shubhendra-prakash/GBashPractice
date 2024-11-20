package integerProgram;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many terms of fibonacci series to print :");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int count=0;
		System.out.println("========fibonacci series======");
		while(count<n) {
			System.out.println(a+" ");
			int sum=a+b;
			a=b;
			b=sum;
			count++;
		}
	}
}
