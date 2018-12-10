import java.util.Scanner;//A simple text scanner 
//Sevde
public class Palindrome {
	public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String i = scan.nextLine();
        if(palindrome(i))
            System.out.println("String is palindrome.");
        else
            System.out.println("String is not palindrome.");
    }
		public static boolean palindrome(String s)
	    {
	        if(s.length() == 0 || s.length() == 1)//s.length() returns the number of charaters in s
	            return true; 
	        if(s.charAt(0) == s.charAt(s.length()-1))//s.charAt(i) returns the ith character of s, 0-based
	            return palindrome(s.substring(1, s.length()-1));//s.substring(i,j) returns the substring that starts with the ith character of s
	        return false;
	    }
	    
	}
	   
	     