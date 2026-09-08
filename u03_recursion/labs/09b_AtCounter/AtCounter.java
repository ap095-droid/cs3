//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;

	public AtCounter() {
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public void countAts(int r, int c) {

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
      
      char[][] mat = atMat;
      if((r >= 0 && r < mat.length) && (c >= 0 && c < mat[r].length)) && mat[r][c] == '@') {
      
         atCount + 
















	}

	public String toString() {
		String output="";
		output+=atCount+" @s connected.";
		return output;
	}
}
