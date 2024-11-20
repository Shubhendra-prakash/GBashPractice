package patternProgram;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			int x=1;
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
}
	               //  OR
	            /*     public static void printPattern(int n) {
	             		for(int i=1;i<=n;i++) {
	             			for(int j=1;j<=i;j++) {
	             				System.out.print(j+" ");
	             			}
	             			System.out.println();
	             		}

	             	}

	             }*/