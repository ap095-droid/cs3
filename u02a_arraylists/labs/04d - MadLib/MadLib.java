//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;

public class MadLib
{
	//add in three ArrayList instance variables
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private ArrayList<String> verbs;

	private String story = "";

	public MadLib()  
	{
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		verbs = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		this();

		loadNouns();
		loadVerbs();
		loadAdjectives();

		try
		{
			Scanner file = new Scanner(new File(fileName));

			while(file.hasNext())
			{
				story += file.next() + " ";
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadNouns()
	{
		try
		{
			Scanner file = new Scanner(new File("nouns.dat"));

			while(file.hasNext())
			{
				nouns.add(file.next());
			}
		}
		catch(Exception e)
		{
		}
	}

	public void loadVerbs()
	{
		try
		{
			Scanner file = new Scanner(new File("verbs.dat"));

			while(file.hasNext())
			{
				verbs.add(file.next());
			}
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner file = new Scanner(new File("adjectives.dat"));

			while(file.hasNext())
			{
				adjectives.add(file.next());
			}
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		int spot = (int)(Math.random() * verbs.size());
		return verbs.get(spot);
	}

	public String getRandomNoun()
	{
		int spot = (int)(Math.random() * nouns.size());
		return nouns.get(spot);
	}

	public String getRandomAdjective()
	{
		int spot = (int)(Math.random() * adjectives.size());
		return adjectives.get(spot);
	}

	public String toString()
	{
		String output = story;

		output = output.replaceAll("NOUN", getRandomNoun());
		output = output.replaceAll("VERB", getRandomVerb());
		output = output.replaceAll("ADJECTIVE", getRandomAdjective());


		while(output.contains("NOUN"))
			output = output.replaceFirst("NOUN", getRandomNoun());

		while(output.contains("VERB"))
			output = output.replaceFirst("VERB", getRandomVerb());

		while(output.contains("ADJECTIVE"))
			output = output.replaceFirst("ADJECTIVE", getRandomAdjective());

		return output;
	}
}