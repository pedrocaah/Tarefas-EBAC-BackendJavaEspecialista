package guloso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guloso {

    public static List<Integer> darTroco(int quantia, int[] moedasDisponiveis) {
        Arrays.sort(moedasDisponiveis);
        int n = moedasDisponiveis.length;
        List<Integer> resultado = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            while (quantia >= moedasDisponiveis[i]) {
                quantia -= moedasDisponiveis[i];
                resultado.add(moedasDisponiveis[i]);
            }
        }

        return resultado;
    }
    public static void main(String[] args) {
        int quantia = 18;
        int[] moedasDisponiveis = {5, 2, 1};

        List<Integer> troco = darTroco(quantia, moedasDisponiveis);
        System.out.println("Moedas usadas para dar troco de " + quantia + ": " + troco);
    }
}
