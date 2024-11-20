package removeDupCharacter;

public class p1 {

	public static void main(String[] args) {
		String s="level";
		removeDupChar(s);
	}
	public static void removeDupChar(String s) {
		int[]p=new int[256];
		for(int i=0;i<s.length();i++)
			p[s.charAt(i)]++;
		for(int i=0;i<p.length;i++)
			if(p[i]>0) {
				System.out.print((char)(i));
			}
	}

}
