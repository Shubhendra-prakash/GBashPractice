package duplicateCharacter;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = sc.nextLine();
		duplicateCharacter(s);
	}
	public static void duplicateCharacter(String s) {
		int count=0;
		int[] p=new int[256];
		for(int i=0;i<s.length();i++) 
			p[s.charAt(i)]++;
		for(int i=0;i<p.length;i++) {
			if(p[i]>1) {
				System.out.print((char)(i));
				count++;
			}	
		}
		System.out.println("\ncount the character: "+count);
	}

}
