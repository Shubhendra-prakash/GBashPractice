package palindromeProgram;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String: ");
		String s1 = sc.nextLine();
		if(checkPalindrome(s1)) 
			System.out.println("this string is a palindrome");
		
		else
			System.out.println("this is not a palindrome string");
	}
	public static boolean checkPalindrome(String s1) {
		String rev = "";
		for(int i=0;i<s1.length();i++) {
			rev=s1.charAt(i)+rev;
		}
		return s1.equalsIgnoreCase(rev);
		
	}

}
