package practiceProgram;

public class palindromeString {

	public static void main(String[] args) {
		String str="madam";
		String org_str = str;
		int len = str.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(org_str.equals(rev))
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
	}
}
