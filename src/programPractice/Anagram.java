package programPractice;

public class Anagram {

	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		if(isAnagram(str1, str2))
			System.out.println("Anagram String");
		else
			System.out.println("not a Anagram String");
	}
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length())
			return false;
		
		int[] arr=new int[256];
		for(int i=0;i<str1.length();i++) {
			arr[str1.charAt(i)]++;
			arr[str2.charAt(i)]--;
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=0)
				return false;
		}
		return true;
	}
}
