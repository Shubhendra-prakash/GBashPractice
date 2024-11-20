package forLoop;

public class printAndCountDivisbleBy12EndsWith8 {

	public static void main(String[] args) {
		int count =0;
		for(int i =8;i<=200;i+=10) {
			if(i%12==0) {
				System.out.println(i);
				count++;
			}
		}
System.out.println("total number of count is :" + count);
	}

}
