package secao1;



import entities.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class enum2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados do cliente");
        System.out.print("Nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Email: ");
        String emailCliente = sc.nextLine();
        System.out.print("Data de aniversário: ");
        String dataAniversario = sc.nextLine();

        LocalDate dataAniversari = LocalDate.parse(dataAniversario, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Cliente cliente = new Cliente(nomeCliente, emailCliente, dataAniversari);
        System.out.println("Insira os dados do pedido: ");
        System.out.print("Status: ");
        String statusProduto = sc.nextLine();
        Ordem ordem = new Ordem(LocalDateTime.now(), StatusOrdem.valueOf(statusProduto), cliente);
        System.out.print("Quantos itens tem nessa ordem?: ");
        int quantidadeItens = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < quantidadeItens; i++ ) {
            System.out.println("Entre com os dados do " + (i+1) + "º produto!");
            System.out.print("Nome do Produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            Double precoProduto = sc.nextDouble();
            System.out.print("Quantidade do produto: ");
            int quantidadeProduto = sc.nextInt();
            sc.nextLine();

            Produto produto = new Produto(nomeProduto, precoProduto);
            OrdemItem ordemItem = new OrdemItem(quantidadeProduto, precoProduto, produto);
            ordem.adicionarItem(ordemItem);
        }

        System.out.println();
        System.out.println(ordem);








    }
}


