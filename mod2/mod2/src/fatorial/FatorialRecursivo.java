package fatorial;

public class FatorialRecursivo {


    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // condição de parada
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 3;
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}


