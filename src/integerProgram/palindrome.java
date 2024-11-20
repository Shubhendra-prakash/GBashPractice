package integerProgram;

public class palindrome {

	public static void main(String[] args) {
		int i=102;
	      checkPalindrome(i);
	}
	public static void checkPalindrome(int n) {
		int rev=0;  int a=n;
		while(n>0) {
			int rem=n%10;
			rev=10*rev+rem;
			n=n/10;
		}
		if(rev==a)
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
	}
}
