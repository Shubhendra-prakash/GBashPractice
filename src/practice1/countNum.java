package practice1;

public class countNum {

	public static void main(String[] args) {
		int num=3456789;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
