package String;

public class bigWord {
	public static void main(String[] args) {
        String s1="i love to play football";
        // Split the sentence into words
        String[] words = s1.split("\\s+");
        // Initialize variables to track the biggest word
        String biggestWord = words[0];
        // Iterate over each word to find the biggest one
        for (String word : words) {
            if (word.length() > biggestWord.length()) {
                biggestWord = word;
            }
        }
        System.out.println("The biggest word is: " + biggestWord);
    }

	}


