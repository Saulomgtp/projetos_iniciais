package application;

import entities.FuncaoRecebendoFuncao;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramacaoFuncionalFuncao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        FuncaoRecebendoFuncao funcao = new FuncaoRecebendoFuncao();

        double soma = funcao.filtrarSoma(list, x -> x.getNome().charAt(0) == 'T');

        System.out.println(soma);








    }
}
