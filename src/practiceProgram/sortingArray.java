package practiceProgram;

import java.util.Arrays;

public class sortingArray {

	public static void main(String[] args) {
		int[] a= {4,3,0,5,0,7,0,5};
		//System.out.println("before sorting:"+Arrays.toString(a));
		int n = a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("after sorting:"+Arrays.toString(a));
	}
}
