package patternProgram;

import java.util.Scanner;

public class plusSign {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		printPlusSign(n);
	}
	public static void printPlusSign(int n)
	{
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				if(i==(n+1)/2 || j==(n+1)/2)
				System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}


	