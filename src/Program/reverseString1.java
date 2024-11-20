package Program;

public class reverseString1 {

	public static void main(String[] args) {
		String org_String="shubhendra prakash";
		System.out.println("reverse string is :"+reverseString(org_String));
	}
	public static String reverseString(String str) {
		String revString="";
		String word="";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' ') {
				revString+=word+" ";
				word="";
			}else {
				word=str.charAt(i)+word;
			}
		}
		revString+=word;
		return revString;
		
	}

}
