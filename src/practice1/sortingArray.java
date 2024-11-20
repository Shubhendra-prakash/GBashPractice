package practice1;

import java.util.Arrays;

public class sortingArray {

	public static void main(String[] args) {
		int[] num= {2,5,4,0,1,6};
		int n=num.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n-1;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("sorting Array:"+Arrays.toString(num));

	}

}
