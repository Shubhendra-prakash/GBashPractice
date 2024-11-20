package test;

public class DigitCount {

	public static void main(String[] args) {
		int num=3479;
		int sum=0;
		while(num>0) {
			sum=sum+num%10;//3 2
			num=num/10;//3 2
		}
		System.out.println(sum);

	}

}
