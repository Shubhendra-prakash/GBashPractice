package String;

import java.util.Scanner;

public class reverseEachWord {
	
		public static void main(String[] args) {
		/*	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String: ");
			String s1=sc.nextLine();
			printWord(s1);
		}
		public static void printWord(String s1)
		{
			String word="";
			for(int i=0;i<s1.length();i++) {
				char x=s1.charAt(i);
				if(x!=' ')
				word=x+word;
				if(x==' ' && !word.isBlank() || i==s1.length()-1) {
					System.out.print(word+" ");
					word="";
				}
			}*/
	        String str = "Hello World This Is Java";
	        String[] words = str.split(" ");
	        String revString = "";
	        for(int i=0;i<words.length;i++) {
	        	String word = words[i];
	        	String revWord = "";
	        	for(int j=word.length()-1;j>=0;j--) {
	        		revWord=revWord+word.charAt(j);
	        	}
	        	revString=revString+revWord+" ";
	        }
	        System.out.println(revString);
	      //  System.out.println(reverseEachWord(str));
	    }

	/*    public static String reverseEachWord(String str) {
	        String result = "";
	        String word = "";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == ' ') {
	                result += reverseWord(word) + " "; // Reverse the word and add it to the result
	                word = ""; // Reset the word
	            } else {
	                word += ch; // Build the word
	            }
	        }
	        result += reverseWord(word); // Reverse the last word and add it
	        return result;
	    }
	    public static String reverseWord(String word) {
	        String reversed = "";
	        for (int i = word.length() - 1; i >= 0; i--) {
	            reversed += word.charAt(i);
	        }
	        return reversed;
	        }*/
	    

		}

	

