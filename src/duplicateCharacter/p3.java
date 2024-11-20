package duplicateCharacter;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s2=sc.nextLine();
		dupChar(s2);
	}
public static void dupChar(String s2) {
	int[]p=new int[256];
	for(int i=0;i<s2.length();i++)
		p[s2.charAt(i)]++;
	for(int i=0;i<p.length;i++) {
		if(p[i]>1) {
			System.out.print((char)(i));
		}
	}
}
}
