package patternProgram;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j<n+1)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}

	}

}