// print x^n where n= stack height //


import java.util.*;
public class Main
{
    public static int calculate(int x, int n){
        
        if(n==0)
        {
            return 1;         //base case 1
        }
        if(x==0)
        {
            return 0;           // base case 2
        }
        
        int xpownum= calculate(x,n-1);
        int xPOW= x* xpownum;
        return xPOW;
    }
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	
		System.out.println("Enter X");
		int x= scan.nextInt();
		System.out.println("Enter n");
		int n = scan.nextInt();
		
		
		System.out.println("The value of X^n = ");
		int res= calculate(x,n);
		System.out.println(res);
		
	}
}

/* ouput:
Enter X
5
Enter n
2
The value of X^n = 
25
*/
