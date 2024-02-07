import java.util.*;
public class Main
{
    public static int  factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        
        
        int i=factorial(n-1);
        int fact = n*i;
        return fact;
        
    }
    
    
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("n: ");
		
		int n = scan.nextInt();
		 int res=factorial(n);
		 
		 System.out.println(res);
	}
}
