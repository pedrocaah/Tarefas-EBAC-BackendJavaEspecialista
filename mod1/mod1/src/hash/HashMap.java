package hash;

public class HashMap {
    private static final int CAPACIDADE = 10;
    private Entry[] tabela;

    static class Entry {
        int key;
        int value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public HashMap() {
        tabela = new Entry[CAPACIDADE];
    }

    private int hash(int key) {
        return key % CAPACIDADE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Entry newEntry = new Entry(key, value);
        if (tabela[index] == null) {
            tabela[index] = newEntry;
        } else {
            Entry current = tabela[index];
            Entry prev = null;
            while (current != null) {
                if (current.key == key) {
                    current.value = value;
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newEntry;
        }
    }

    public int get(int key) {
        int index = hash(key);
        Entry current = tabela[index];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }

    public void delete(int key) {
        int index = hash(key);
        Entry current = tabela[index];
        Entry prev = null;
        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    tabela[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void clear() {
        tabela = new Entry[CAPACIDADE];
    }

    public void printMap() {
        for (int i = 0; i < CAPACIDADE; i++) {
            System.out.print("[" + i + "]");
            Entry current = tabela[i];
            while (current != null) {
                System.out.print(" -> {" + current.key + ", " + current.value + "}");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashMap mapa = new HashMap();
        mapa.put(1, 10);
        mapa.put(2, 20);
        mapa.put(3, 30);

        System.out.println("Valor para chave 2: " + mapa.get(2));
        System.out.println("Valor para chave 11: " + mapa.get(30));

        mapa.printMap();

        mapa.delete(2);
        System.out.println("Valor para chave 2 após deletar: " + mapa.get(2));

        mapa.printMap();

        mapa.clear();
        System.out.println("Mapa após clear:");
        mapa.printMap();
    }
}
