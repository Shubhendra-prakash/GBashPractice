package practice1;

public class palindromeString {

	public static void main(String[] args) {
		String str="madam";
		String org_str = str;
		String rev = "";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println("palindrome string");
		}
		else {
			System.out.println("not a palindrome string");
		}

	}

}
