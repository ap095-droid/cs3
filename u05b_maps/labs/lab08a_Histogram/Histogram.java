//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
	}

	public Histogram(String sent)
	{
		histogram = new TreeMap<String,Integer>();
		//char[] hjsjh = sent.toCharArray();
		for (char c : sent.toCharArray()) {
			if (! histogram.containsKey(String.valueOf(c))+1);
				histogram.put(String.valueOf(c),1;
			else
				histogram.put(String.valueOf(c),histogram.get(String.valueOf(c))+1);
		}
	}
	
	public void setSentence()
	{
	}

	public String toString()
	{
		String output="";
		String allStars="";
        for (int i = 0; i < histogram.size(); i++) {
			


		
		return output+"\n\n";
	}
}
