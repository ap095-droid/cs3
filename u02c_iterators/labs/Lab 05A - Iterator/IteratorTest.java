import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import static java.lang.System.*;

class IteratorTest {
   public static void populateListFromString(ArrayList<String> list, String strList){   
      list.clear();
      addToListFromString(list, strList);
      

   }

   public static void addToListFromString(ArrayList<String> list, String strList)   {   
   
        String[] words = strList.split(" ");
        for (int i = 0; i < words.length; i++) {
         list.add(words[i]);

   }
   
   /*** REMOVE ***/
   public static void remove(ArrayList<String> list, String toRemove) {
       Iterator<String> = new Iterator(list);
       for (String woa : list) {
         if (num > 
       
                               
   }

   /*** REPLACE ***/
   public static void replace(ArrayList<String> list, String toRemove, String replaceWith) {

   } 
}