package fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    final Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testFibonacci() {
        Assert.assertEquals(55, fibonacci.findElement(10));
        Assert.assertEquals(0, fibonacci.findElement(0));
        Assert.assertEquals(1, fibonacci.findElement(1));
    }
}
