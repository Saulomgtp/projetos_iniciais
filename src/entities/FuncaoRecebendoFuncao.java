package entities;

import java.util.List;
import java.util.function.Predicate;

public class FuncaoRecebendoFuncao {

    public double filtrarSoma(List<Product> list, Predicate<Product> criterio) {
        double soma = 0;

        for(Product p : list) {
            if (criterio.test(p)) {
                soma += p.getPreco();
            }
        }
        return soma;
    }
}
