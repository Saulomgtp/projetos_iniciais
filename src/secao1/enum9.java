package secao1;



import entities.ContaBancaria;
import entities.ContaBancariaExcecao;

import java.util.Scanner;

public class enum9 {
    public static void main(String[] args) throws ContaBancariaExcecao {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("Digite o número da sua conta: ");
            int numeroConta = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome do titular da conta: ");
            String nomeConta = sc.nextLine();
            System.out.print("Digite o saldo inicial da conta: ");
            Double saldoInicial = sc.nextDouble();
            System.out.print("Digite o limite de saque da conta: ");
            Double limiteSaque = sc.nextDouble();
            System.out.println();

            ContaBancaria conta = new ContaBancaria(numeroConta, nomeConta, saldoInicial, limiteSaque);

            System.out.println(conta);
            System.out.println();

            System.out.print("Digite o valor que deseja sacar: ");
            Double valorSaque = sc.nextDouble();

            conta.saqueConta(valorSaque);

            System.out.println();
            System.out.println(conta);
        }
        catch (ContaBancariaExcecao e) {
            System.out.println(e.getMessage());

            //mostrar exceção na tela em vermelho e parar o programa  throw new ContaBancariaExcecao(e.getMessage());
        }
        System.out.println("Programa finalizado");
    }
}


