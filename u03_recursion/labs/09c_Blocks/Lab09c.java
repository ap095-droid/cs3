//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab09c
{
	public static void main( String args[] ) throws IOException
	{
       String[] letters = {"A", "E", "I", "O", "U"};
       Grid test = new Grid(6, 6, letters);
       out.println(test);
       out.println("A count == " + test.findMax("A"));
   
	}
}

