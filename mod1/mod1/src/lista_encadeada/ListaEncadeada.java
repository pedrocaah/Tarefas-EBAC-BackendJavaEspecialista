package lista_encadeada;

public class ListaEncadeada {
    private Node cabeca;

    static class Node {
        int dado;
        Node proximo;

        public Node(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    public ListaEncadeada() {
        this.cabeca = null;
    }

    public void push(Node node) { //Tempo: O(n) Espaço: O(1)
        if (cabeca == null) {
            cabeca = node;
        } else {
            Node atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = node;
        }
    }

    public Node pop() { //Tempo: O(n) Espaço: O(1)
        if (cabeca == null) {
            return null;
        }

        if (cabeca.proximo == null) {
            Node temp = cabeca;
            cabeca = null;
            return temp;
        }

        Node atual = cabeca;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }

        Node ultimoNode = atual.proximo;
        atual.proximo = null;
        return ultimoNode;
    }

    public void insert(int index, Node node) { // Tempo: O(n) Espaço: O(1)
        if (index < 0) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }

        if (index == 0) {
            node.proximo = cabeca;
            cabeca = node;
            return;
        }

        Node atual = cabeca;
        for (int i = 0; i < index - 1; i++) {
            if (atual == null) {
                throw new IndexOutOfBoundsException("Índice inválido: " + index);
            }
            atual = atual.proximo;
        }

        node.proximo = atual.proximo;
        atual.proximo = node;
    }

    public void remove(int index) { // Tempo: O(n) Espaço: O(1)
        if (index < 0 || cabeca == null) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }

        if (index == 0) {
            cabeca = cabeca.proximo;
            return;
        }

        Node atual = cabeca;
        for (int i = 0; i < index - 1; i++) {
            if (atual.proximo == null) {
                throw new IndexOutOfBoundsException("Índice inválido: " + index);
            }
            atual = atual.proximo;
        }

        if (atual.proximo == null) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }

        atual.proximo = atual.proximo.proximo;
    }

    public Node elementAt(int index) { // Tempo: O(n) Espaço: O(1)
        if (index < 0) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }

        Node atual = cabeca;
        for (int i = 0; i < index; i++) {
            if (atual == null) {
                throw new IndexOutOfBoundsException("Índice inválido: " + index);
            }
            atual = atual.proximo;
        }

        return atual;
    }

    public int size() { // Tempo: O(n) Espaço: O(1)
        int tamanho = 0;
        Node atual = cabeca;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    public void printList() {
        Node atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        Node primeiroNode = new Node(10);
        Node segundoNode = new Node(20);
        Node terceiroNode = new Node(30);

        lista.push(primeiroNode);
        lista.push(segundoNode);
        lista.push(terceiroNode);

        System.out.print("Lista original: ");
        lista.printList();

        Node novoNode = new Node(15);
        lista.insert(1, novoNode);
        System.out.print("Lista após inserção: ");
        lista.printList();

        lista.remove(2);
        System.out.print("Lista após remoção: ");
        lista.printList();

        Node element = lista.elementAt(1);
        System.out.println("Elemento na posição 1: " + element.dado);

        int tamanho = lista.size();
        System.out.println("Tamanho da lista: " + tamanho);
    }
}
