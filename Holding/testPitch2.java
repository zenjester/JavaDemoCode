import java.io.*;

public class testPitch2
{
	public static void main (String [] args)
	{
		Pitch tentPitch[] 	= new Pitch [100];
		tentPitch[1] 	= new Pitch( 2, "Tent", "sunny acres");
		Pitch camperPitch 	= new Pitch(11,"MotorHome","Camper Van Green");
		
		try
		{
			FileOutputStream fos = new FileOutputStream("Pitches.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(tentPitch[1]);
			oos.writeObject(camperPitch);
			oos.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
