package application;


import entities.Contrato;
import entities.PaypalService;
import entities.ServicosPagamentos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramaServicoOnline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número contrato: ");
        int numeroContrato = sc.nextInt();
        sc.nextLine();
        System.out.print("Data do contrato (dd/MM/yyyy): ");
        String dataContrato = sc.nextLine();
        System.out.print("Valor total do contrato: ");
        Double valorContrato = sc.nextDouble();
        System.out.print("Entre com o número de parcelas que deseja: ");
        int quantidadeParcelas = sc.nextInt();
        sc.nextLine();

        Contrato contrato = new Contrato(numeroContrato, LocalDate.parse(dataContrato, DateTimeFormatter.ofPattern("dd/MM/yyyy")), valorContrato);
        PaypalService teste = new PaypalService();
        for (int i = 1; i <= quantidadeParcelas; i++) {
            Double soma = teste.juros(valorContrato, quantidadeParcelas, i);
            System.out.println("Parcela nº" + i + " (" + contrato.getDataContrato().plusMonths(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "): R$" + soma);
        }
    }
}
