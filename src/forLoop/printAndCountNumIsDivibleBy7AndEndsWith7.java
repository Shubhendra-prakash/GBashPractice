package forLoop;

public class printAndCountNumIsDivibleBy7AndEndsWith7 {

	public static void main(String[] args) {
		int count=0;
		for(int i=7;i<=500;i+=7) {
			if(i%10==7) {
				System.out.println(i);
				count++;
			}
		}
       System.out.println("total num divisble by 7 and ending with 7 is :" + count);
	}

}
