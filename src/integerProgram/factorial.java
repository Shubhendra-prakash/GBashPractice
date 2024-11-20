package integerProgram;

public class factorial {

	public static void main(String[] args) {
		int x=5;
		getFactorial(x);
	}
	public static int getFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(n+"!="+fact);
		return fact;
	}
}
