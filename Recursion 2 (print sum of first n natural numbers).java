import java.util.*;
public class Main
{
	public static void PrintSum(int i , int n , int sum )    // i for count , n for base case , sum for calculata sum
	{
	    if(i==n)            // Base case
	    {
	        sum+=i;
	        System.out.println(sum);
	        return ;
	    }
	    
	    
	    sum+=i;
	    PrintSum(i+1,n,sum);
	}
	
	
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter n: ");
		
		int n = scan.nextInt();
		
		PrintSum(1,n,0);
	}
}
