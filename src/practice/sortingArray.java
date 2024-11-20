package practice;

import java.util.Arrays;

public class sortingArray {

	public static void main(String[] args) {
		int[] num= {1,3,5,4,2,7,6,5};
		int a=num.length;
		for(int i=0;i<=a-1;i++) {
			for(int j=i+1;j<=a-1;j++) {
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
