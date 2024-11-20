package String;

public class smallestWord {

	public static void main(String[] args) {
  		        String s1="i love to play football";
		        // Split the sentence into words
		        String[] words = s1.split("\\s+");
		        // Initialize variables to track the smallest word
		        String smallestWord = words[0];
		        // Iterate over each word to find the smallest one
		        for (String word : words) {
		            if (word.length() < smallestWord.length()) {
		                smallestWord = word;
		            }
		        }
		        System.out.println("The smallest word is: " + smallestWord);
		    }
	}


