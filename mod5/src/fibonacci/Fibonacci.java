package fibonacci;

public class Fibonacci {

    public int findElement(int n) {
        if (n <= 1) {
            return n;
        }

        return findElement(n - 1) + findElement(n - 2);
    }
}