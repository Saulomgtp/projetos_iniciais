package application;

import entities.Ex11;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ex11 contaa;
        //instanciar a minha conta


        System.out.print("Favor informar o número da conta: ");
        int conta = sc.nextInt();

        System.out.print("Favor informar o nome do titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println();

        System.out.print("Você deseja depositar um valor no momento da abertura da conta? s/n: ");
        char x = sc.next().charAt(0);

        while (!(x == 'n' || x == 's')) {
            System.out.print("Favor digite sim ou não! s/n: ");
            x = sc.next().charAt(0);
        }
        if (x == 's') {
            System.out.print("Favor digite o valor a ser depositado: ");
            double depositoInicial = sc.nextDouble();
            contaa = new Ex11(conta, nome, depositoInicial);
        } else {
            contaa = new Ex11(conta, nome);
            // iniciar a minha conta /\
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(contaa);

        System.out.println();

        System.out.print("Digite um valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        contaa.deposito(valorDeposito);     // fazer essa operação para rodar o método com o valor do deposito

        System.out.println("Updated account data:");
        System.out.println(contaa);

        System.out.println();

        System.out.print("Digite um valor para saque: ");
        double valorSaque = sc.nextDouble();
        contaa.saque(valorSaque);    // fazer essa operação para rodar o método com o valor do saque

        System.out.println("Updated account data:");
        System.out.println(contaa);

        System.out.println();




    }


    }

