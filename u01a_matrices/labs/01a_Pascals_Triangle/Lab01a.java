//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01a
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab01a.dat"));

		while(file.hasNextInt())
		{
			int size = file.nextInt();

			PascalsTriangle test = new PascalsTriangle(size);

			out.println(test);
		}
	}
}
