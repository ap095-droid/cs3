//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab01c
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("lab01c.dat"));

		while(file.hasNextInt())
		{
			int size = file.nextInt();

			MagicSquare square = new MagicSquare(size);
			square.createMagic();

			out.println(square);
		}

		file.close();
	}
}