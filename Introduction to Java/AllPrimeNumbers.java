import java.util.Scanner;
public class AllPrimeNumbers {
	    public static void main(String args[]) 
	    {   
	    	
	    	Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        
	       
	        // int div = 2;
//	        System.out.println("11");
	        for( int num = 2; num<=n; num++){
//	        	if(num==3) {
//	        	System.out.println(num);
//	        	
//	        	}
//	        	 System.out.println("13");
	        	int div = 2;
	            for(;div<num;div++){
	            	
//	            	 System.out.println("15");
	                if(num%div!=0){
//	                	 System.out.println("17");
	                    continue;
	                }
	     
//	                System.out.println("20");
	                break;
	            }
//	            System.out.println("23");
	            if(num%div==0&&num!=2 && num!=div){
	                continue;
	            }
//	            System.out.println("28");   
	            System.out.println(num);

//	            num++;
	            // div = 2;
	        }
	    	}

}
