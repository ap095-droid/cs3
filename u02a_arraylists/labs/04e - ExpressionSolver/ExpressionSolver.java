//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	private String expression;
	private int answer;

	public ExpressionSolver(String s)
	{
		setExpression(s);
	}

	public void setExpression(String s)
	{
		expression = s.replaceAll("\\s+", "");
		answer = 0;
	}

	public void solveExpression()
	{
		answer = solve(expression);
	}

	private int solve(String exp)
	{
		
		while(exp.indexOf("(") != -1)
		{
			int close = exp.indexOf(")");
			int open = exp.lastIndexOf("(", close);

			String inside = exp.substring(open + 1, close);
			int value = solve(inside);

			exp = exp.substring(0, open) + value + exp.substring(close + 1);
		}

		ArrayList<String> list = new ArrayList<String>();

		String num = "";
		for(int i = 0; i < exp.length(); i++)
		{
			char ch = exp.charAt(i);

			if(Character.isDigit(ch))
			{
				num += ch;
			}
			else
			{
				list.add(num);
				list.add("" + ch);
				num = "";
			}
		}
		list.add(num);

		
		for(int i = 1; i < list.size(); i += 2)
		{
			if(list.get(i).equals("^"))
			{
				int a = Integer.parseInt(list.get(i - 1));
				int b = Integer.parseInt(list.get(i + 1));

				int value = (int)Math.pow(a, b);

				list.remove(i - 1);
				list.remove(i - 1);
				list.set(i - 1, "" + value);

				i -= 2;
			}
		}

		
		for(int i = 1; i < list.size(); i += 2)
		{
			if(list.get(i).equals("*") || list.get(i).equals("/"))
			{
				int a = Integer.parseInt(list.get(i - 1));
				int b = Integer.parseInt(list.get(i + 1));

				int value;

				if(list.get(i).equals("*"))
					value = a * b;
				else
					value = a / b;

				list.remove(i - 1);
				list.remove(i - 1);
				list.set(i - 1, "" + value);

				i -= 2;
			}
		}

		
		for(int i = 1; i < list.size(); i += 2)
		{
			if(list.get(i).equals("+") || list.get(i).equals("-"))
			{
				int a = Integer.parseInt(list.get(i - 1));
				int b = Integer.parseInt(list.get(i + 1));

				int value;

				if(list.get(i).equals("+"))
					value = a + b;
				else
					value = a - b;

				list.remove(i - 1);
				list.remove(i - 1);
				list.set(i - 1, "" + value);

				i -= 2;
			}
		}

		return Integer.parseInt(list.get(0));
	}

	public String toString()
	{
		return expression + " = " + answer;
	}
}
