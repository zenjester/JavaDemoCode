// Prof Parker's dice rolling prog

import java.util.Random;

public class RandomNumbers
{
	public static void main(String[] args)
	{
		Random randomNumbers = new Random(); // this generates a random number
		int value;
		
		for (int counter= 1; counter <= 20; counter ++)
		{
			// pick a number between 1 and 6
			
			value = 1 +randomNumbers.nextInt(6);
			
			System.out.printf("%d ", value); //use printf to format output value
			
			if (counter % 5 == 0) // use modulo of counter to start a new line
				System.out.println();
			}
		}
	}
		
		
