package duplicateCharacter;

public class p5 {

	public static void main(String[] args) {
		String s4="level";
		dupChar(s4);
	}
	public static void dupChar(String s4) {
		int[]p=new int[256];
		for(int i=0;i<s4.length();i++)
			p[s4.charAt(i)]++;
		for(int i=0;i<p.length;i++) {
			if(p[i]>1) {
				System.out.println((char)(i));
			}
		}
	}

}
