package n_rainha;

/* Dado um tabuleiro de tamanho NxN, devemos colocar N rainhas no tabuleiro de forma que nenhuma delas se ataquem
Exemplo para N = 4
0 1 0 0 -> x = 0, y = 1
0 0 0 1
1 0 0 0
0 0 1 0
 */

public class Main {

    private static boolean temAtaque(int x, int y, int[][] tab) {
        //Checando linhas e colunas
        for (int j = 0; j < tab.length; j++) {
            if (tab[x][y] == 1) {
                return true;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i][y] == 1) {
                return true;
            }
        }
        // Checando diagonais
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                int indEsq = i + j;
                int indDir = i - j;

                if (indEsq == (x + y)) {
                    if (tab[i][j] == 1) {
                        return true;
                    }
                }
                if (indDir == (x - y)) {
                    if (tab[i][j] == 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static void printBoard(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.println(tab[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean resolveNRainhas(int[][] tab, int n) {
        // Checa se todas as rainhas foram colocadas
        if (n == 0) {
            return true;
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (temAtaque(i, j, tab)) {
                    continue;
                }
                //Colocando rainha no tabuleiro
                tab[i][j] = 1;
                if (resolveNRainhas(tab, n - 1)) {
                    return true;
                }
                //Desfazendo a mudança
                tab[i][j] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] tab = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int n = 0;

        boolean result = resolveNRainhas(tab, n);

        if (result) {
            printBoard(tab);
        } else {
            System.out.println("N > que espaços no tabuleiro");
        }
    }
}