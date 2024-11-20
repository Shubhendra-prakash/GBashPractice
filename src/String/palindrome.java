package String;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		if(checkPalindrome(s))
			System.out.println("this is palindrome string");
		else
			System.out.println("this is not palindrome string");
	}
	public static boolean checkPalindrome(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		return s.equalsIgnoreCase(rev);
	}
}
