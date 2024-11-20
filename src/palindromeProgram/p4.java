package palindromeProgram;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String: ");
		String s4 = sc.nextLine();
		if(checkPalindrome(s4)) 
			System.out.println("this string is a palindrome");
		else
			System.out.println("this string is not a palindrome");
	}
	public static boolean checkPalindrome(String s4) {
		String rev = "";
		for(int i=0;i<s4.length();i++) {
			rev=s4.charAt(i)+rev;
		}
		return s4.equalsIgnoreCase(rev);
		
	}

}
