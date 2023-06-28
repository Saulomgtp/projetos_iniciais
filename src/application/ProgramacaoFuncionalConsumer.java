package application;

import entities.PriceUpdate;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramacaoFuncionalConsumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.forEach(new PriceUpdate());   //criar a classe Price Update e criar o método lá
        list.forEach(x -> x.setPreco(x.getPreco() * 1.1));      // fazer tudo na mesma linha xdxdxdxdxdxdxdxdxdx

        list.forEach(System.out :: println);






    }
}
