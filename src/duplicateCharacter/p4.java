package duplicateCharacter;

public class p4 {

	public static void main(String[] args) {
		String s3="level";
		dupChar(s3);
	}
public static void dupChar(String s3) {
	int[]p=new int [256];
	for(int i=0;i<s3.length();i++)
		p[s3.charAt(i)]++;
	for(int i=0;i<p.length;i++) {
		if(p[i]>1) {
			System.out.println((char)(i));
		}
	}
}
}