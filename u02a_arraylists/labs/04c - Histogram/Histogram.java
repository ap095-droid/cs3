//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
	}

	public Histogram(char[] values, String fName)
	{
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>();
		fileName = fName;

		for(char ch : values)
		{
			letters.add(ch);
			count.add(0);
		}

		out.println("search letters = " + letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(new File(fileName));

		while(file.hasNext())
		{
			String word = file.next().toLowerCase();

			for(int i = 0; i < word.length(); i++)
			{
				char ch = word.charAt(i);

				for(int j = 0; j < letters.size(); j++)
				{
					if(ch == letters.get(j))
					{
						count.set(j, count.get(j) + 1);
					}
		    }
		}
	}

		file.close();
	}

	public char mostFrequent()
	{
		int maxIndex = 0;

		for(int i = 1; i < count.size(); i++)
		{
			if(count.get(i) > count.get(maxIndex))
			{
				maxIndex = i;
			}
		}

		return letters.get(maxIndex);
	}

	public char leastFrequent()
	{
		int minIndex = 0;

		for(int i = 1; i < count.size(); i++)
		{
			if(count.get(i) < count.get(minIndex))
			{
				minIndex = i;
			}
		}

		return letters.get(minIndex);
	}

	public String toString()
	{
	 return fileName
	 + "\n" + letters
	 + "\n" + count + "\n\n\n";
	}
}


/*
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
	}

	public Histogram(char[] values, String fName)
	{
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
	}

	public char mostFrequent()
	{
		return '#';
	}

	public char leastFrequent()
	{
		return '#';
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
*/