//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;

	public SyntaxChecker()
	{
	}

	public SyntaxChecker(String s)
	{
	}
	
	public void setExpression(String s)
	{
		exp = s;
	}

	public boolean checkExpression()
	{
		Stack<String> symbols = new Stack<>();

		String[] words = exp.split(" ");

		for (String symbol : words) {
			symbols.push(symbol);
		}

		Map<String, String> map = new TreeMap<String,String>();
		map.put("[ , ]");
		map.put("[ , ]");
		map.put("[ , ]");
		map.put("[ , ]");
		map.put("[ , ]");
		map.put("[ , ]");
		out.println("map = " + map);
		out.println("symbols = " + symbols);


		boolean what = false;

		for (int j = 0; j < values.length; 
		
      //You can change this to a stack of Strings if you prefer.
   	Stack<Character> symbols;     
   
   
		return false;
	}

	//write a toString method
}
