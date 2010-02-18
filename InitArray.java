import java.util.Random; // library to allow random numbers

public class InitArray
{
	public static void main(String[] args)
	{
		int[] array;//declare an array name array
		array = new int[10]; //create array objects to store random vlaues
		
		int [] oneLineArray = new int [10];
	    Random arrayValue = new Random(); //initiates random number generator
		System.out.printf("%s%8s\n", "Index","Value");// print headings
		
		for (int counter =0; counter<array.length;counter++)
		{
		    array[counter]= arrayValue.nextInt(100); //set seed to 100 and generate a random value
			System.out.printf("%5d%8d\n", counter,array[counter]);
		}
		for (int counter = 0; counter<oneLineArray.length;counter++)
		{
		   //routine for second array
			oneLineArray[counter]= arrayValue.nextInt(1000); //set seed to 100 and generate a random value
			System.out.printf("%5d%8d\n", counter-9,oneLineArray[counter]);
		}
	}
}
		
