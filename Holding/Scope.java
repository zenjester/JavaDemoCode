// A class to demonstrate variable scopes

public class Scope

{
	private int x = 1; // field x is acessible to all methods of the class
	
	
public void begin ()
	{
		int x=5; // x is the local method variable
		
		System.out.printf("local x in method begin is %d\n", x);
		
		useLocalVariable(); //use the value of x form useLocalVariable
		useField(); //useField uses class Scope's field x
		useLocalVariable(); //useLocalVariable Reinitializes local x
		useField(); //class Scope's field x retains its value
		
		System.out.printf("\nlocal x in method begin is %d\n",x);
	}
	
public void useLocalVariable()
{
	int x = 25; // x is initialized everytime the useLocalVariable is called
	
	System.out.printf("\nlocal x on entering method useLocalVariable is %d\n", x);
	++x; //modifies x
	System.out.printf("\nlocal x on exiting method useLocalVariable is %d\n", x);
}

public void useField()
{
	System.out.printf("\nfield on entering method useField is %d\n", x);
	x*=10; //modifies class Scope's field x
	System.out.printf( "field x before exiting method usefield is %d\n", x);
}
}
		
