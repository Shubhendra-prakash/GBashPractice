package programPractice;

public class occurance {

	public static void main(String[] args) {
		String str="abcbdcbcbd";
		int totalCount = str.length();
		int tCount = str.replace("ab","").length();
		int count=totalCount-tCount;
		System.out.println(count);

	}

}
