package Program;

public class primeNum {

	public static void main(String[] args) {
		int num=6;
		int count=0;
		for(int i=1;i<=6;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("it is prime num");
		else
			System.out.println("it is not prime num");

	}

}
