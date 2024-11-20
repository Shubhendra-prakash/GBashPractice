package Program;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		int[] num= {2,0,1,5,4,8,6,0};
		int len = num.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-1;j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));

	}

}
