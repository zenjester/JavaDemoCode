import java.io.*;

public class Pitch implements Serializable
{
	int pitchNumber;
	String pitchType;
	String pitchName;
	
	public Pitch (int p, String t, String n)
	{
		pitchNumber = p;
		pitchType = t;
		pitchName = n;
	}
	
	public int getPitchNumber()
	{
		return pitchNumber;
	}
	
	public String getPitchType()
	{
		return pitchType;
	}
	
	public String getPitchName()
	{
		return pitchName;
	}
}
		
	
