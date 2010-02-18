public class EnhancedArrays
{
	public static void main (String [] args)
	{
		int[] array = {12,61,3,71,83, 50};
		int total = 0;
		
		for (int number:array) // specialised for no need for a counter
			total += number; //number is the array elemment value
		
		System.out.println( "Total of values in array = " + total);
	}
}
