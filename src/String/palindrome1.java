package String;

import java.util.Scanner;

public class palindrome1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		if(checkPalindrome(s))
			System.out.println("this string is a Palindrome");
		else
			System.out.println("this string is Not a Palindrome");
	}
	public static boolean checkPalindrome(String s) {
		s=s.toLowerCase();
		int len=s.length();
		for(int i=0;i<len/2;i++) {
			if(s.charAt(i)!=s.charAt(len-i-1))
				return false;
		}
		return true;
	}
}
