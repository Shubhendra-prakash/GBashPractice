package practice1;

public class palindromeNum {

	public static void main(String[] args) {
		int num=101;
		int org_num=num;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println("palindrome num");
		}
		else {
			System.out.println("not a palindrome num");
		}
		

	}

}
