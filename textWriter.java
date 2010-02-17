import java.io.*;

public class textWriter
{
	public static void main (String[] args)
	{
		try 
		{
			FileWriter txtOut = new FileWriter ("bob.txt");
			txtOut.write("You are all scum");
			txtOut.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
