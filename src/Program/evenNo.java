package Program;

import java.util.Scanner;

public class evenNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int i = sc.nextInt();
		do {
			if(i%2==0)
			System.out.println(i);
			i++;
		}
		while(i>0);
	}
}
