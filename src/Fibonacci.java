
public class Fibonacci {
	
	public int fibonacciResult(int number) {
		 	
	 	if (number <= 1){ 
	 		return number;
	 	}
        else{
        	int oneBefore = fibonacciResult(number-1);
        	int twoBefore = fibonacciResult(number-2);
        	int currentResult = oneBefore + twoBefore;
        	
        	return currentResult;
        }	        	
    }	    
}
