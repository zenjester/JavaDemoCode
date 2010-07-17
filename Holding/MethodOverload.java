public class MethodOverload
{
	public void testOverloadedMethods()
	{
		System.out.printf("Square of integer 7 is %d\n", square(7));
		System.out.printf("Square of double 7.5 is %f\n",square(7.5));
	}
	
	public int square(int intValue)
	{
		System.out.printf("\nCalled square with int arguement: %s\n", intValue);
		return intValue * intValue;
	}
	
	public double square(double doubleValue)
	{
		System.out.printf("\nCalled square with double arguement: %f\n", doubleValue);
		return doubleValue * doubleValue;
	}
}
		
		
