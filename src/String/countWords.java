package String;

import java.util.Scanner;

public class countWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s = sc.nextLine();
		int len = s.length();
		int count=1;
		for(int i=0;i<=len-1;i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("num of count: "+count);

	}

}
