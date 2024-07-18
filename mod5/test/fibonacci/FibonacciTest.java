package fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    final Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testFibonacci() {
        int primeiraSomaFibonacci = 2;
        Assert.assertEquals(55, fibonacci.findElement(10));
        Assert.assertEquals(0, fibonacci.findElement(primeiraSomaFibonacci-2));
        Assert.assertEquals(1, fibonacci.findElement(primeiraSomaFibonacci-1));
    }
}
