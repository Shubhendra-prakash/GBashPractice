package integerProgram;

public class checkPrime {

	public static void main(String[] args) {
		int count=0;
		for(int i=2;i<=100;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("total prime number are:"+ count);
	}
	public static boolean checkPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
