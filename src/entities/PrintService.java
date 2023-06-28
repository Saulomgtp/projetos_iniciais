package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    List<T> list = new ArrayList<>();

    public void adicionarValor (T valor) {
        list.add(valor);
    }
    public T primeiroNumero() {
        if (list.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        }
        return list.get(0);
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

}
