package patternProgram;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n) {
		int x=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}

	}

}
