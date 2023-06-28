package application;

import entities.Product;
import entities.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgramacaoFuncionalFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));


        //list.STREAM troca de lista para stream (só pode usar o map como stream)
        List<String> names = list.stream().map(x -> x.getNome().toUpperCase()).collect(Collectors.toList());
        //                                                                     /\ para voltar para lista

        //função map pega a função descrita e coloca em todos valores da lista





        names.forEach(System.out :: println);






    }
}
