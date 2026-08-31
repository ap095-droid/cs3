//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{

	}

	public void setWords(String wordList)
	{
     if (wordList == null) {
         throw new NullPointerExcpetion("wordlist cannot be null!");
      }
      
      words = new ArrayList<Word>();
      String[] ray = new wordList.split(" ");
      for (String str : ray) {
         words.add(new Word(str));





	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;





		return count;
	}
	
	public void removeWordsWithXChars(int size)
	{

     if (wordList.size.contains("X").equalsIgnoreCase) {
         wordList.remove(x.fromWordList)




	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;






		return count;
	}
	
	public String toString()
	{
	   return "";
	}
   
   
   
   public List<Word> getWords() {
      return (List<Word>)Collections.unmodifiableList(words);
}
