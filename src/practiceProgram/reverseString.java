package practiceProgram;

public class reverseString {
	public static void main(String[] args) {
		String originalString = "Hello World This Is Java";
        System.out.println("Reversed String: " + reverseWords(originalString));
    }
    public static String reverseWords(String str) {
		 String reversedString = "";
	        String word = "";

	        // Traverse the string from end to start
	        for (int i = str.length() - 1; i >= 0; i--) {
	            if (str.charAt(i) == ' ') {
	                reversedString += word + " ";
	                word = "";  // Reset the word
	            } else {
	                word = str.charAt(i) + word;  // Build the word
	            }
	        }
	        reversedString += word;  // Add the last word
	        return reversedString;
	}
}
