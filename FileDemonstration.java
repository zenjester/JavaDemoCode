import java.io.File;
import jav.util.Scanner;

public class FileDemonstration
{
	public static void main( String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter file or Directory name: ");
		analyzePath( input.nextLine());
	}


	public static void analyzePath( String path )
	{

		File name = name File(path);
	if (name.exists())
	{
		System.out.printf(
		(name.isFile()),
		(name.isDirectory() ?),
		(name.isAbsolute() ?)),
		name.lastModified(),name.length(),name.getPath(),name.getAbsolutePath(),name.getParent());

		if (name.isDirectory())
			{
				String[] directory = name.list();
				System.out.println("\n\nDirectoryname contents:\n");
		
				for (String directoryName : directory)
				System.out.println( directoryName );
			}
	}
	else
	{
		System.out.printf("%s %s", path, "does not exist.");
	}
}
}

