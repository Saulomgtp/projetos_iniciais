package application;


import entities.Locacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramaLocacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da locação: ");
        System.out.print("Modelo do carro: ");
        String nomeCarro = sc.nextLine();
        System.out.print("Data da locação (dd/MM/yyyy hh:ss): ");
        String dataLocacao = sc.nextLine();
        System.out.print("Data da entrega (dd/MM/yyyy hh:ss): ");
        String dataEntrega = sc.nextLine();
        System.out.print("Digite o preço por hora do carro: ");
        Double precoHora = sc.nextDouble();
        System.out.print("Digite o preço por hora do carro: ");
        Double precoDia = sc.nextDouble();

        Locacao locacao = new Locacao(nomeCarro, LocalDateTime.parse(dataLocacao, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")), LocalDateTime.parse(dataEntrega, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")), precoHora, precoDia);

        System.out.println();
        System.out.println("Dados da locação: ");
        System.out.println(locacao);
    }
}