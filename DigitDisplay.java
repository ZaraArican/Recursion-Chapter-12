// ******************************************************************
// DigitPlay.java
//
// Finds the number of digits in a positive integer.
// ******************************************************************
import java.util.Scanner;//A simple text scanner which can parse primitive types and strings using regular expressions
public class DigitDisplay
{//Sevdenur
public static void main (String[] args)
{
int num; //a number
Scanner scan = new Scanner(System.in);//scans the console 
System.out.println ();
System.out.print ("Please enter a positive integer: ");
num = scan.nextInt ();
if (num <= 0)
 System.out.println ( num + " isn't positive -- start over!!");
else
	if(sumDigits(num)%7==0)
		System.out.println("Valid");
	else
		System.out.println("Not Valid");
 {

 System.out.println ();
 }
}
// -----------------------------------------------------------
// Recursively counts the digits in a positive integer
// -----------------------------------------------------------
public static int sumDigits (int num)//recursive algorithm
{//finds the sum of the digits in a positive integer
if (num < 10)
return (1);//the recursive step, the value returned is 1 (counts the units digit) 
else
return (num%10 + sumDigits (num/10));//num/10 is the quotient when num is divided by 10 so it would be
//all the digits except the units digit.
}
}
