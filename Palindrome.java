import java.util.*;

public class Palindrome 
{

    public static void main(String[] args) 
    {

    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter your step ");
    	int n=sc.nextInt();
    	
  //  if(n<=7)
  //  {  
        for (int i = 1; i <= n&&i<=7; i++) 
        {
            for (int j = n; j > i; j--) 
            {
                System.out.print(" ");
            }
            for (int m = 1; m <=i; m++) 
            {
                System.out.print(m);
            }
            
            for(int m=i-1;m>=1;m--)
            {
            	System.out.print(m);
            }

            System.out.print("\n");
        }

    //}    
    //else
    //{
    //System.out.println("Please reenter the number which is smaller or equal than 7");
    //int n=sc.nextInt();
   // }    
        
      
    }
}