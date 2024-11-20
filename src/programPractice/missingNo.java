package programPractice;

public class missingNo {

	public static void main(String[] args) {
		    int[] num= {2,3,4,5,7};
		    int sum1=0;
		    for(int i=0;i<=num.length-1;i++) {
		    	sum1=sum1+num[i];
		    }
		    int sum2=0;
		    for(int i=2;i<=7;i++) {
		    	sum2=sum2+i;
		    }
		    System.out.println("missing no is :"+(sum2-sum1));
	}

}
