package integerProgram;

public class palindromeInRange {

	public static void main(String[] args) {
		for(int i=100;i<=200;i++) {
			checkPalindrome(i);
		}
	}
	public static void checkPalindrome(int n) {
		int rev=0;   int a=n;
		while(n>0) {
			int rem=n%10;
			rev=10*rev+rem;
			n=n/10;
		}
		if(rev==a)
			System.out.println(a+" ");
	}
}
