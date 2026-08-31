//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle(int size)
	{
		mat = new int[size][size];
		createTriangle();
	}

	public void createTriangle()
	{
		mat[0][0] = 1;

		for(int r = 1; r < mat.length; r++)
		{
			for(int c = 0; c <= r; c++)
			{
				if(c == 0 || c == r)
					mat[r][c] = 1;
				else
					mat[r][c] = mat[r-1][c-1] + mat[r-1][c];
			}
		}
	}

	public String toString()
	{
		String output = "";

		for(int r = 0; r < mat.length; r++)
		{
			for(int c = 0; c <= r; c++)
			{
				output += String.format("%-4d", mat[r][c]);
			}
			output += "\n";
		}

		return output;
	}
}
