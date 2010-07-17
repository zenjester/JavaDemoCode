
import java.io.*;

public class ReadPitch2
{
	public static void main(String [] args)
	{
		Pitch tentPitch[] 	= new Pitch [100];
		int counter;
		try 
		{
			ObjectInputStream ois = new ObjectInputStream (new FileInputStream("Pitches.txt"));
			
			for (counter = 0; counter<(tentPitch.length);counter++)
			{
				tentPitch[counter] = (Pitch) ois.readObject();
				System.out.println(counter);	
			}		
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("First Pitch number " + tentPitch[0].getPitchNumber());
		System.out.println("Second Pitch Type" + tentPitch[1].getPitchType());
va}
		
		
