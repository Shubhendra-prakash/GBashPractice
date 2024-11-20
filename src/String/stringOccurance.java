package String;

public class stringOccurance {

	public static void main(String[] args) {
		String str = "Java Programming";
		int totalcount = str.length();
		int totalcount_afterRemoving = str.replace("a", "").length();
		int count = totalcount-totalcount_afterRemoving;
		System.out.println("occurance in string:"+count);
		

	}

}
