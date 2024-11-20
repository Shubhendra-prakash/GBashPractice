package palindromeProgram;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word: ");
		String s2 = sc.nextLine();
		if(checkPalindrome(s2))
			System.out.println("this word is Palindrome");
		else
			System.out.println("this word is not a Palindrome");
	}
	public static boolean checkPalindrome(String s2) {
		String rev = "";
		for(int i=0;i<s2.length();i++) {
			rev=s2.charAt(i)+rev;
		}
		return s2.equalsIgnoreCase(rev);
	}

}
