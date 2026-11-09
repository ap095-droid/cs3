//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{

      map = new TreeMap<String,Set<String>> map;
		

	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		
        String person = personRelative[0];
		String relative = personRelative[1];
		

		if (map.containsKey(k)) {
			String rel = map.get(personRelative[0]))

	}
        Set<String> relative = new Set<>();
		relative.add(personRelative[1]);
    	}


	public String getRelatives(String person)
	{
		if(map.containsKey(person)) {
			return person + "is related to " + map.get(person); 
		//map.put(person, map.get(person));
			
		return person + " has no relatives listed.";
	}


	public String toString()
	{
		String output="";








		return output;
	}
}
