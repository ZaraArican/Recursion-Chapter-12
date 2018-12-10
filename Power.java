// *****************************************************************
// Power.java
//
// Reads in two integers and uses a recursive power method
// to compute the first raised to the second power.
// *****************************************************************
import java.util.Scanner;//A simple text scanner which can parse primitive types and strings using regular express
public class Power//Sevde
{//Did this in class with prof
public static void main(String[] args)
{
int base, exp;
int answer;
Scanner scan = new Scanner(System.in);
System.out.print("Welcome to the power program! ");
System.out.println("Please use integers only.");
//get base
System.out.print("Enter the base you would like raised to a power: ");
base = scan.nextInt();
//get exponent
System.out.print("Enter the power you would like it raised to: ");
exp = scan.nextInt();
answer = power (base,exp);//base and exp and calls method power tocompute baseexp
System.out.println(base + " raised to the " + exp + " is " + answer);//prints answer
}
// ----------------------------------------------
// Computes and returns base^exp
// ----------------------------------------------
public static int power(int base, int exp)
{
int pow;
if(exp==0)
	return 1;
else
	return base*power(base,exp-1);
//if the exponent is 0, set pow to 1
//otherwise set pow to base*base^(exp-1)
//return pow
}
}