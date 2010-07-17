// a simple example to show passing arrays to methods

public class MethodArray
{
	public static void main (String [] args)
	{
		int [] array = {1,2,3,4,5};
		
		squareArray(array);
		
	}
// a method not in a seperate class
public static void squareArray( int [] a)
{
	System.out.println("The squares of the numbers are : ");
	for (int number: a) // the enhanced for statement
	System.out.println( number*number);
}
}
