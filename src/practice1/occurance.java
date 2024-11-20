package practice1;

public class occurance {

	public static void main(String[] args) {
		String str="welcome to Java Programming";
	int totalCount=	str.length();
		int tCount = str.replace("a", "").length();
		int count=totalCount-tCount;
		System.out.println(count);
	}
}
