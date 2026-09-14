

import static java.lang.System.*;

public class Lab05b
{
	public static void main(String[] args)
	{
		ListIteratorTest test;

		test = new ListIteratorTest("a b c a b c a +");
		test.replace("a", "+");
		out.println(test);

		test = new ListIteratorTest("a b c d e f g h i j x x x x x 7");
		test.replace("x", "7");
		out.println(test);

		test = new ListIteratorTest("1 2 3 4 5 6 a b c a b c b #");
		test.replace("b", "#");
		out.println(test);
	}
}
