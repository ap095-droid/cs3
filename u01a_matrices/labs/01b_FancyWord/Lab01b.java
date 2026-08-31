//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab01b.dat"));

		int numSets = file.nextInt();
		file.nextLine();

		for(int i = 0; i < numSets; i++)
		{
			String word = file.nextLine();

			FancyWord fancy = new FancyWord(word);

			out.println(fancy);
		}

		file.close();
	}
}
