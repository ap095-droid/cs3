//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Grid
{
   private String[][] grid;

	public Grid()
	{
	}

	public Grid(int rows, int cols, String[] vals)
	{
         grid = new String[rows][cols];
	}
	
	public void setGrid(int rows, int cols, String[] vals)
	{
      int max = Integer.MIN_VALUE;
      int count = 0;
      String[][] gridFaker = grid;
      for (int r = 0; r < gridFaker.length; r++;) {
         for (int c = 0; c < gridFaker[r].length; c++) {
            if (gridFaker[r][c] =
            
	}

	public int findMax(String val)
	{
		int count=-1;
      int max = Integer.MINIMUM;
      if 
      
		return count;
	}

	private int findMax(int r, int c, String search)
	{
		return 0;
	}

	public String toString()
	{
		String output="";
      for (int r = 0; r < grid.length; r++;) {
         for (int c = 0; c < grid.le
      
		return output;
	}
}

