package algoritmos_avancados;

public class Fibonacci {
    private static final int MAX_ELEMENTS = 100;
    private static final long[] elementsFib = new long[MAX_ELEMENTS];

    public static long findElementPD(int n) {
        for (int i = 0; i < MAX_ELEMENTS; i++) {
            elementsFib[i] = -1;
        }

        return findElement(n);
    }

    public static long findElement(int n) {
        if (elementsFib[n] == -1) {
            if (n <= 1) {
                elementsFib[n] = n;
            } else {
                elementsFib[n] =  findElement(n - 1) + findElement(n - 2);
            }
        }
        return elementsFib[n];
    }

    public static void main(String[] args) {
        int n = 70;

        System.out.println("Element " + n + ": " + findElementPD(n));
    }
}
