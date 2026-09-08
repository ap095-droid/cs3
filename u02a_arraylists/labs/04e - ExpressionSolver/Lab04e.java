//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.io.File;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Lab04e
{
	public static void main( String args[] ) throws Exception
	{
		Scanner file = new Scanner(new File("lab04e.dat"));

		while(file.hasNextLine())
		{
			String exp = file.nextLine();

			ExpressionSolver test = new ExpressionSolver(exp);
			test.solveExpression();

			out.println(test);
		}
	}
}
