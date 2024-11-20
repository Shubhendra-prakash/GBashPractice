package integerProgram;

public class strongInRange {

	public static void main(String[] args) {
		for(int i=1;i<=200;i++) {
			checkStrong(i);
		}
	}
	public static void checkStrong(int n) {
		int sum=0;     int a=n;
		while(n>0) {
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==a)
			System.out.println(a+" ");	
	}
}
