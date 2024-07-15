package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public static List<List<Integer>> calcularSubconjuntos(int[] S, int n) {
        List<List<Integer>> resultado = new ArrayList<>();
        backtrack(S, n, 0, new ArrayList<>(), resultado);
        return resultado;
    }

    // Função de backtracking
    private static void backtrack(int[] S, int n, int inicio, List<Integer> atual, List<List<Integer>> resultado) {
        if (atual.size() == n) {
            resultado.add(new ArrayList<>(atual));
            return;
        }

        for (int i = inicio; i < S.length; i++) {
            atual.add(S[i]);
            backtrack(S, n, i + 1, atual, resultado);
            atual.remove(atual.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] S1 = {1, 2, 3};
        int n1 = 2;
        System.out.println("Subconjuntos de " + n1 + " elementos de S1: " + calcularSubconjuntos(S1, n1));

        int[] S2 = {1, 2, 3, 4};
        int n2 = 1;
        System.out.println("Subconjuntos de " + n2 + " elementos de S2: " + calcularSubconjuntos(S2, n2));
    }
}
