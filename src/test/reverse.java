package test;

public class reverse {

	public static void main(String[] args) {
		 String originalString = "Hello, World!";
	        String reversedString = reverseString(originalString);
	        System.out.println("Original String: " + originalString);
	        System.out.println("Reversed String: " + reversedString);
	    }

	    public static String reverseString(String str) {
	        char[] charArray = str.toCharArray();
	        String reversed = "";
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            reversed += charArray[i];
	        }
	        return reversed;

	}

}
