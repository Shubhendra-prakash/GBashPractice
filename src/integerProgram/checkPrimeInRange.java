package integerProgram;

import java.util.Scanner;

public class checkPrimeInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int range = sc.nextInt();
		System.out.println("All prime number upto: "+range);
		for(int i=2;i<=range;i++)
			checkPrime(i);
	}
	public static void checkPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==2)
			System.out.println(n+" ");
	}

}
