package test;

public class primeNum {

	public static void main(String[] args) {
		int num=6;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) 
					count++;
			}
			if(count==2) {
				System.out.println("it is a prime num");
			}
			else{
				System.out.println(" not a prime num");
			}
		}
	}

}
