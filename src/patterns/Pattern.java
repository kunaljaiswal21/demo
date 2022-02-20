package patterns;

class Pattern{
    static void pattern1(int n){
        for(int r=n; r>=1; r--)
        {
            for(int c=r; c>=1; c--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
             
    }
    static void pattern2(int n){ 
    	
        for(int r=1; r<= 2*n-1; r++)
        {
        	if(r <= n)
        	{
        		for(int c=1; c<=r; c++)
        			System.out.print("* ");
        		
        		System.out.println();
        	}
        	
        	else {
        		for(int c=1; c <= 2*n-r; c++)
        			System.out.print("* ");
        		
        		System.out.println();
        	}
        	
        }
             
    }
    
 static void pattern3(int n){ 
    	
        for(int r=1; r<= 2*n-1; r++)
        {
        	int totCols = r > n ? 2*n-r: r;

        	int spaces = n - totCols;
        	
        	for(int s=0; s<spaces; s++)
        		System.out.print(" ");
        	
        		for(int c=1; c <= totCols; c++)
        		{
        				System.out.print("* ");
        		}
        		
        		System.out.println();
        }
        	
        
             
    }
    
    public static void main(String[] args) {

        pattern3(5);
    }
}