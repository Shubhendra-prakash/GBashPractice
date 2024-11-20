package practice;

public class primeNum {

	public static void main(String[] args) {
		int num=17;
		int count=0;
		if(num>0) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2)
				System.out.println("it is prime num");
			else
				System.out.println("it is not a prime num");
		}
	}
}
