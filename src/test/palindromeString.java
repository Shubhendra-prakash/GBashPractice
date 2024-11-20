package test;

public class palindromeString {

	public static void main(String[] args) {
		String s="shubh";
		String org_s = s;
		int len = s.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(org_s.equals(rev)) {
			System.out.println("it is a palindrome string");
		}
		else {
			System.out.println("it is not a palindrome string");
		}

	}

}
