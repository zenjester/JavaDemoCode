import java.io.*;

public class textReader
{
	public static void main (String [] args)
	{
		try
		{
			File txtIn = new File("bob.txt");
			FileReader fileReader = new FileReader(txtIn);
			
			BufferedReader reader = new BufferedReader(fileReader); // an efficient caching system
			
			String line = null; // use line to store data from file null = empty
			
			while ((line = reader.readLine()) !=null) // read each line of text until no more present
			{
				System.out.println(line);
			}
			reader.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
							
