package String;

public class palindrome2 {

	public static void main(String[] args) {
		String s="mom";
		char ch[]=s.toCharArray();
		String s1="";
		for(int i=ch.length-1;i>=0;i--)
		{
			s1=s1+ch[i];
		}
		System.out.println(s1);
		if(s1.equals(s))
		{
			System.out.println("The given string is palindrome");		
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
	}
	}


