package test;

public class prime1 {

	public static void main(String[] args) {
		int num=7;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) 
					count++;
			}
			if(count==2) {
				System.out.println("prime num");
			}
			else {
				System.out.println("not a prime num");
			}
		}

	}

}
