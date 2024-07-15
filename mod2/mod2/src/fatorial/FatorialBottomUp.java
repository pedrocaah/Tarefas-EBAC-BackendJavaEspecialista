package fatorial;

public class FatorialBottomUp {
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }

        int[] fatorialArray = new int[n + 1];
        fatorialArray[0] = 1;

        for (int i = 1; i <= n; i++) {
            fatorialArray[i] = i * fatorialArray[i - 1];
        }

        return fatorialArray[n];
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fatorial de " + n + " é " + fatorial(n));
    }
}