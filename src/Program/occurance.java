package Program;

public class occurance {

	public static void main(String[] args) {
		String str="welcome tom Java programming";
	int totalcount = str.length();
		int tcount = str.replace("m", "").length();
		int count = totalcount-tcount;
		System.out.println(count);

	}

}
