package programPractice;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		int[] num= {1,3,2,5,4,7,6,0};
		int n=num.length;
		for(int i=0;i<=n-1;i++) {
			for(int j=i+1;j<=n-1;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		

	}

}
