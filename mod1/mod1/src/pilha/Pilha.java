package pilha;

public class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    public void push(int item) { // Tempo: O(1) Espaço: O(1)
        if (topo == capacidade - 1) {
            System.out.println("A pilha está cheia");
        }
        elementos[++topo] = item;
    }

    public int pop() { // Tempo: O(n) Espaço: O(1)
        if (topo == -1) {
            System.out.println("A pilha está vazia");
        }
        return elementos[topo--];
    }

    public int top() {
        return elementos[topo];
    }

    public boolean isEmpty() {
        if (topo == -1) {
            return true;
        }
        return false;
    }

    public int size() {
        return topo + 1;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Inteiro no topo é o: " + pilha.top());
//        while (!pilha.isEmpty()) {pilha.pop();}
//        System.out.println("Desempilhando: " + pilha.pop());
//        System.out.println("Desempilhando: " + pilha.pop());
//        System.out.println("Desempilhando: " + pilha.pop());
        System.out.println("Lista vazia? " + pilha.isEmpty());
        System.out.println("Tamanho da pilha: " + pilha.size());

    }
}
