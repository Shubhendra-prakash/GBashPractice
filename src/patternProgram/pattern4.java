package patternProgram;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j<=n+1)
					System.out.print("* ");
			}
			System.out.println();
		}

	}

}