import java.util.*;
public class Main
{
    public static void fibonacii(int a ,int b, int n)
    {
         
        if(n==0)
        {
            return;
        }
        int c=(a+b);
        System.out.println(c);
        fibonacii(b,c,n-1);
    }
    
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("n:");
		int n= scan.nextInt();
		
		int a=0;
		int b=1;
		
		System.out.println("Fibonacii Series: ");
		System.out.println(a);
		System.out.println(b);
		
		fibonacii(a,b,n-2);
	}
}
