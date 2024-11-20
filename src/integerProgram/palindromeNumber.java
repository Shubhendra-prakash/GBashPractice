package integerProgram;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num:");
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println(org_num+" this is a palindrome Number");
		}
		else {
			System.out.println(org_num+" this is not a palindrome Number");
		}

	}

}
