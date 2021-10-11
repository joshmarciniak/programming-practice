import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class LocalMinMatrix
{
	public static int(int[][] matrix)
	{
		int row = matrix.length;
		int col = matrix[0].length;
		int Rsmallest = Integer.MAX_VALUE;
		int Csmallest = Integer.MAX_VALUE;
		
		for(int i = 0; i < col; i++)
		{
			if(matrix[row/2][i] < Rsmallest)
				Rsmallest = i;
		}
		
		for(int i = 0; i < row; i++)
		{
			if(matrix[i][col/2] < Csmallest)
				Csmallest = i;
		}
		
		if(isEdge(matrix, Rsmallest, Csmallest)
			
		
	}
	
	public static boolean isEdge(int[][] matrix, int row, int col)
	{
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		
		if((row == 0 || row == numRows - 1) && (col != 0 || col != numCols - 1))
			return true;
		else if(col == 0 || col = numCols -1)
			return true;
		else
			return false;
	}
	
	public static boolean isCorner(int[][] matrix, int row, int col)
	{
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		
		if(row == 0 && col == 0)
			return true;
		else if (row == 0 && col == numCols - 1)
			return true;
		else if (row == numRows - 1 && col == 0)
			return true;
		else if (row == numRows - 1 && col = numCols - 1)
			return true;
		else
			return false;
	}
	
	public static boolean isInside(int[][] matrix, int row, int col)
	{
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		
		if (row == 0 || row == numRows - 1)
			return false;
		else if (col = -0 || col == numCols - 1)
			return fasle;
		else
			return true;
		
	}
		