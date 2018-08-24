
public class SquareProblem {
	public static void main(String[] args) {
		SquareProblem squareProblem = new SquareProblem();
		int array[][] = {
				{0, 1, 1, 0, 1}, 
                {1, 1, 0, 1, 0}, 
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}
		};
		squareProblem.printMaxSubSquare(array);
	}
	void printMaxSubSquare(int[][] array)
	{
	  int i,j;
	  int R = array.length;
	  int C = array[0].length;
	  int S[][] = new int[R][C];
	  
	  
	  int max_of_s, max_i, max_j; 
	  
	  /* Set first column of S[][]*/
	  for(i = 0; i < R; i++)
	     S[i][0] = array[i][0];
	  
	  /* Set first row of S[][]*/    
	  for(j = 0; j < C; j++)
	     S[0][j] = array[0][j];
	      
	  /* Construct other entries of S[][]*/
	  for(i = 1; i < R; i++)
	  {
	    for(j = 1; j < C; j++)
	    {
	      if(array[i][j] == 1) 
	        S[i][j] = min(S[i][j-1], S[i-1][j], S[i-1][j-1]) + 1;
	      else
	        S[i][j] = 0;
	    }    
	  } 
	   
	  /* Find the maximum entry, and indexes of maximum entry 
	     in S[][] */
	  max_of_s = S[0][0]; max_i = 0; max_j = 0;
	  for(i = 0; i < R; i++)
	  {
	    for(j = 0; j < C; j++)
	    {
	      if(max_of_s < S[i][j])
	      {
	         max_of_s = S[i][j];
	         max_i = i; 
	         max_j = j;
	      }        
	    }                 
	  }     
	  
	/*for (int kl = Math.min(max_i - max_of_s,max_j - max_of_s) ; (max_i+kl < array.length)&& (max_j+kl < array[0].length) ; kl--) {
		for (int ll = kl; ll < kl ; ll++ ) {
			if(array[max_i + ll] == 0) {
				break;
			}
		}
		for (int ll = kl; ll < kl ; ll-- ) {
			if(array[max_i + ll] == 0) {
				break;
			}
		}
	}*/
	  
	  for(i = max_i; i > max_i - max_of_s; i--)
	  {
	    for(j = max_j; j > max_j - max_of_s; j--)
	    {
	      System.out.print(array[i][j] + " ");
	    }  
	    System.out.println();
	  }  
	}     
	 
	/* UTILITY FUNCTIONS */
	/* Function to get minimum of three values */
	int min(int a, int b, int c)
	{
	  int m = a;
	  if (m > b) 
	    m = b;
	  if (m > c) 
	    m = c;
	  return m;
	}

}
