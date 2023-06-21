package secao1;

import entities.Produto1;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class enum5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos que deseja cadastrar: ");
        int quantidadeProdutos = sc.nextInt();
        sc.nextLine();
        List<Produto1> produtos = new ArrayList<>();

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Digite os dados do " + (i+1) + "º produto!");
            System.out.print("É um produto comum, usado ou importado (c/u/i)??");
            char n = sc.next().charAt(0);
            sc.nextLine();
            if(n == 'i') {
                System.out.print("Nome do produto: ");
                String nomeProduto = sc.nextLine();
                System.out.print("Preço do produto: ");
                Double precoProduto = sc.nextDouble();
                System.out.print("Taxa de importação do produto: ");
                Double taxaImportacao = sc.nextDouble();

                Produto1 prod = new ProdutoImportado(nomeProduto, precoProduto, taxaImportacao);
                produtos.add(prod);
            } else if (n == 'c') {
                System.out.print("Nome do produto: ");
                String nomeProduto = sc.nextLine();
                System.out.print("Preço do produto: ");
                Double precoProduto = sc.nextDouble();

                Produto1 prod = new Produto1(nomeProduto, precoProduto);
                produtos.add(prod);
            } else if (n == 'u') {
                System.out.print("Nome do produto: ");
                String nomeProduto = sc.nextLine();
                System.out.print("Preço do produto: ");
                Double precoProduto = sc.nextDouble();
                System.out.print("Data de fabricação do produto (DD/MM/YYYY): ");
                sc.nextLine();
                String dataFabricacao = sc.nextLine();

                LocalDate dataFab = LocalDate.parse(dataFabricacao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                Produto1 prod = new ProdutoUsado(nomeProduto, precoProduto, dataFab);
                produtos.add(prod);
            }
        }
        System.out.println();
        System.out.println("Tag de preços: ");
        for (Produto1 prod : produtos) {
            System.out.println(prod.tagPreco());
        }
    }
}


