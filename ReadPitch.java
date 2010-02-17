import java.io.*;

public class ReadPitch
{
	public static void main(String [] args)
	{
		try 
		{
			ObjectInputStream ois = new ObjectInputStream (new FileInputStream("Pitches.txt"));
			Pitch one = (Pitch) ois.readObject();
			Pitch two = (Pitch) ois.readObject();
			
			System.out.println("First Pitch number " + one.getPitchNumber());
			System.out.println("Second Pitch Type" + two.getPitchType());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
		
		
