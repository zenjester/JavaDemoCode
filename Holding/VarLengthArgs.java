// example of variable length arguments

public class VarLengthArgs
{
	public static void main (String [] Args)
	{
		int [] two = {1,2};
		int [] three = {1,2,3};
		int [] four =  {1,2,3,4};
		
		System.out.println( "two numbers");
		doubler(two);
		System.out.println( "three numbers");
		doubler(three);
		System.out.println( "four numbers");
		doubler(four);
		
	}
	
	public static void doubler (int... a)
	{
		System.out.println("The doubles  of the numbers are : ");
		for (int number: a) // the enhanced for statement
		System.out.println( number*2);
		
		return;
	}
}
		
