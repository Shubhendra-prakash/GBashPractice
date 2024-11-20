package Program;

public class palindromeNum {

	public static void main(String[] args) {
		int num=102;
		int rev=0;
		int org_num = num;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println("it is palindrome num");
		}
		else {
			System.out.println("it is not palindrome num");
		}

	}

}
