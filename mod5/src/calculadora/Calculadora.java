package calculadora;


public class Calculadora {
    /**
     * Classe que faz os cálculos de operações básicas de matemática para tarefa de conclusão do módulo,conforme solicitado pelo professor .
     * Todos os métodos recebem dois parâmetros do tipo double para realizar operações de números decimais caso o cliente necessite.
     * @param a O primeiro número a ser usado na operação
     * @param b O segundo número a ser usado na operação
     * @return O resultado da operação de acordo com o método chamado
     */
    public double soma(double a, double b) {
        return a + b;
    }

    public double subtrai(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        return a / b;
    }
}
