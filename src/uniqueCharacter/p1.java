package uniqueCharacter;

public class p1 {

	public static void main(String[] args) {
		String s="level";
		uniqueChar(s);
	}
	public static void uniqueChar(String s) {
		int[]p=new int[256];
		for(int i=0;i<s.length();i++)
			p[s.charAt(i)]++;
		for(int i=0;i<p.length;i++)
			if(p[i]==1) {
				System.out.println((char)i);
			}
	}

}
