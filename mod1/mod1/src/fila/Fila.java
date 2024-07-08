package fila;

public  class Fila {
    private int[] elementos;
    private int frente;
    private int tras;
    private int tamanho;

    public Fila(int capacidade) {
        this.elementos = new int[capacidade];
        this.frente = 0;
        this.tras = 0;
        this.tamanho = 0;
    }

    public void enqueue(int item) { // Tempo e Espaço = O(1)
        if (tamanho == elementos.length) {
            throw new IllegalStateException("A fila está cheia");
        }
        elementos[tras] = item;
        tras = (tras + 1) % elementos.length;
        tamanho++;
    }

    public int dequeue() { // Tempo e Espaço = O(1)
        if (tamanho == 0) {
            throw new IllegalStateException("A fila está vazia");
        }
        int item = elementos[frente];
        frente = (frente + 1) % elementos.length;
        tamanho--;
        return item;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }

    public int rear() {
        return elementos[tras];
    }

    public int front() {
        return elementos[frente];
    }

    public static void main(String[] args) {
        Fila fila = new Fila(10);
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);


        System.out.println("Rear: " + fila.rear());
        System.out.println("Front: " + fila.front());
        System.out.println("Size: " + fila.size());
        System.out.println("Is empty: " + fila.isEmpty());

        System.out.println("Desenfileirando: " + fila.dequeue());  // Deve imprimir 10
        System.out.println("Desenfileirando: " + fila.dequeue());  // Deve imprimir 20
        System.out.println("Desenfileirando: " + fila.dequeue());  // Deve imprimir 30
        System.out.println("Size: " + fila.size());
        System.out.println("Is empty: " + fila.isEmpty());

    }
}
