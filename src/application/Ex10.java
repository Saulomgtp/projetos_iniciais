package application;

import java.util.Scanner;

import entities.Ex7;
import entities.Ex9;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex9 conta;

        // OS CONTRUTORES VÃO JUNTAR AS VARIÁVEISSSSSSSSS

        System.out.print("Informe o número da sua conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Qual o nome do titular da conta? ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Você deseja realizar um depósito no momento da abertura da sua conta? s/n");
        char x = sc.next().charAt(0);

        while (!(x == 's' || x == 'n')) {
            System.out.println("Favor digitar se você deseja realizar um depósito ou não!! s/n");
            x = sc.next().charAt(0);
        }
        if (x == 's') {
            System.out.println("Digite o valor do seu depósito inicial");
            double valor = sc.nextDouble();
            conta = new Ex9(numeroConta, nome, valor);
        } else {
            conta = new Ex9(numeroConta, nome);
        }

        System.out.println("Account data:");
        System.out.println(conta);

        System.out.print("Digite o valor que você deseja depositar: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito); // fazer essa operação para rodar o método com o valor do deposito

        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.print("Digite o valor que você deseja sacar: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque); // fazer essa operação para rodar o método com o valor do deposito

        System.out.println("Updated account data:");
        System.out.println(conta);














    }
}
