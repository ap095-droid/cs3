//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat = new char[0][0];
	}

	public FancyWord(String word)
	{
		mat = new char[word.length()][word.length()];

		// fill with spaces
		for(int r = 0; r < mat.length; r++)
		{
			for(int c = 0; c < mat[r].length; c++)
			{
				mat[r][c] = ' ';
			}
		}

		// top and bottom rows
		for(int i = 0; i < word.length(); i++)
		{
			mat[0][i] = word.charAt(i);
			mat[word.length()-1][i] = word.charAt(i);
		}

		// middle rows
		for(int i = 1; i < word.length()-1; i++)
		{
			mat[i][i] = word.charAt(i);
			mat[i][word.length()-1-i] = word.charAt(word.length()-1-i);
		}
	}

	public String toString()
	{
		String output = "";

		for(int r = 0; r < mat.length; r++)
		{
			for(int c = 0; c < mat[r].length; c++)
			{
				output += mat[r][c];
			}

			output += "\n";
		}

		return output;
	}
}

