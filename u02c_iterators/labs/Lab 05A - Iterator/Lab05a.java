import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Lab05a
{
public static void main(String[] args)
{
ArrayList<String> list = new ArrayList<String>();

IteratorTest.populateListFromString(list, "a b c a b c a a");
IteratorTest.remove(list, "a");
out.println(list);

IteratorTest.populateListFromString(list, "a b c d e f g h i j x x x x x");
IteratorTest.remove(list, "x");
out.println(list);

IteratorTest.populateListFromString(list, "1 2 3 4 5 6 a b c a b c b");
IteratorTest.remove(list, "b");
out.println(list);
   }
}

