import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {	

	@Test
	public void testFibonacciResult() {	
		Fibonacci fibonacci = new Fibonacci();;
		
		Assert.assertEquals(0, fibonacci.fibonacciResult(0));
		Assert.assertEquals(1, fibonacci.fibonacciResult(1));
		Assert.assertEquals(1, fibonacci.fibonacciResult(2));
		Assert.assertEquals(2, fibonacci.fibonacciResult(3));
		Assert.assertEquals(3, fibonacci.fibonacciResult(4));
		Assert.assertEquals(5, fibonacci.fibonacciResult(5));
		Assert.assertEquals(8, fibonacci.fibonacciResult(6));
		Assert.assertEquals(13, fibonacci.fibonacciResult(7));
		Assert.assertEquals(21, fibonacci.fibonacciResult(8));
		Assert.assertEquals(34, fibonacci.fibonacciResult(9));
		Assert.assertEquals(55, fibonacci.fibonacciResult(10));
		 
		Assert.assertEquals(6765, fibonacci.fibonacciResult(20));
	}	
}
