package fatorial;

import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = n * fatorial(n - 1);
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fatorial de " + n + " é " + fatorial(n));
    }
}
