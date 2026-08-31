//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] magicSquare;

	public MagicSquare()
	{
		magicSquare = new int[0][0];
      
	}

	public MagicSquare(int size)
	{
     if (size = 0) {
      throw new IllegalArgumentException("This size must be positive!");
      magicSquare = new int[size][size];
      createMagic(size);
	}
	
	public void setSize(int size)
	{
     magicSquare.length = new int[size][size]
     
	}

	public void createMagic()
	{
		int num = 1;
		magicSquare[0][magicSquare.length/2]= num;
      
      
	}

	public String toString( )
	{
		String output="";
      for (int r = 0; r < magicSquare.length; r++) {
         for (int c = 0; c <magicSquare[r].length; c++) {
         }
       }
       
         
         output += magicSquare[row][col];
         output += "\t";
         
         output += "\n";
         
         
		return output;
	}
}

