package practiceProgram;

import java.util.Scanner;

public class missingNum {

	public static void main(String[] args) {
		/*int[] num= {2,3,4,6};
		int sum1=0;
		for(int i=0;i<num.length;i++) {
			sum1=sum1+num[i];
		}
         System.out.println(sum1);
         int sum2 = 0;
         for(int i=2;i<=6;i++) {
        	 sum2=sum2+i;
         }
         System.out.println(sum2);
         System.out.println("missing num is:"+(sum2-sum1));*/
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Size: ");
		int size=sc.nextInt();
		System.out.println("ENter the String: ");
		sc.nextLine();
		String s1=sc.nextLine();
		getMissingDigit(s1, size);
	}
	public static void getMissingDigit(String s1, int size)
	{
		int sum=size*(size+1)/2;
		int str_sum=0;
		for(int i=0;i<s1.length();i++) {
			str_sum=str_sum+(s1.charAt(i)-48);
		}
		System.out.println("The Missing Digit is: "+(sum-str_sum));
	}

}
