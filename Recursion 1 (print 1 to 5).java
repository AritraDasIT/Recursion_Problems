
public class Main
{
	   
		
		public static void print(int n){
		   
		   
		   if(n>5)
		   {
		       return;          //base case
		   }
		    System.out.println(n);
		    print(n+1);                  //recursive call
		} 
	
	public static void main(String[] args) {
	    
	    int n=1;
	    
	    print(n);   // funcion call
	}
}
