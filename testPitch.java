import java.io.*;

public class testPitch
{
	public static void main (String [] args)
	{
		Pitch tentPitch 	= new Pitch( 2, "Tent", "sunny acres");
		Pitch camperPitch 	= new Pitch(11,"MotorHome","Camper Van Green");
		
		try
		{
			FileOutputStream fos = new FileOutputStream("Pitches.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(tentPitch);
			oos.writeObject(camperPitch);
			oos.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
