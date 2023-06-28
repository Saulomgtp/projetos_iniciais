package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramacaoFuncionalPredicato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(x -> x.getPreco() >= 100);
     // list.removeIf(x -> x.getNome().charAt(0) == 'T');     //filtrando só a lista que começa com a letra T

        for (Product p : list) {
            System.out.println(p);
        }





    }
}
