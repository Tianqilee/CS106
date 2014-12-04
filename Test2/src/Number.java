/**
 * 
 */

/**
 * @author tli1
 *
 */
public class Number {

	/**
	 * @param args
	 */
	
	   public static void main(String[] args) {  
	        print(10);      
	    }  
	      
	    // print 1 to n  
	    private static void print(int n) {  
	        if (n > 1) {  
	            print(n - 1);  
	        }  
	        System.out.println(n);  
		
			}
	}
