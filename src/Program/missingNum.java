package Program;

public class missingNum {

	public static void main(String[] args) {
		int[] num= {2,4,5,6};
		int sum1=0;
		for(int i=0;i<num.length;i++) {
			sum1=sum1+num[i];
		}
		int sum2 = 0;
		for(int i=2;i<=6;i++) {
			sum2=sum2+i;	
		}
		System.out.println("missing num is:"+(sum2-sum1));

	}

}
