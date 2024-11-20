package whileLoop;

public class numIsDivisbleBy12AndCount {

	public static void main(String[] args) {
		int i = 1;
		int count=0;
		while(i<=200) {
			if(i%12==0) {
				System.out.println(i);
		     	count++;
			}
			i++;
		}
System.out.println("total count is: "+ count);
	}
}
