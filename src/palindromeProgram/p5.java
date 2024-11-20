package palindromeProgram;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s5 = sc.nextLine();
		if(checkPalindrome(s5)) 
		System.out.println("this string is a palindrome");
		else
			System.out.println("this is not a string palindrome");
	}
	public static boolean checkPalindrome(String s5) {
		String rev = "";
		for(int i=0;i<s5.length();i++) {
			rev=s5.charAt(i)+rev;
		}
		return s5.equalsIgnoreCase(rev);
	}

}
