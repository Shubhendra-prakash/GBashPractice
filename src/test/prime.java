package test;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
			int n=sc.nextInt();
		int count=0;
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		System.out.println(count);
		if(count==1)
		{
			System.out.println("The given number is prime");
		}
		else
		{
			System.out.println("The given number is not prime");
		}
	}
	}


