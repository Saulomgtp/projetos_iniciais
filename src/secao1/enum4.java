package secao1;


import entities.Funcionarios;
import entities.FuncionariosTerceirizados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class enum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = sc.nextInt();
        List<Funcionarios> listaFuncionarios = new ArrayList<>();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("Dados do " + (i+1) +  "º funcionário: ");
            System.out.print("O funcionário é terceirizado (y/n)? ");
            char n = sc.next().charAt(0);
            if(n == 'n') {
                System.out.print("Nome: ");
                sc.nextLine();
                String nomeFuncionario = sc.nextLine();
                System.out.print("Quantidade de horas trabalhadas: ");
                int horasTrabalhadas = sc.nextInt();
                sc.nextLine();
                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();
                Funcionarios func = new Funcionarios(nomeFuncionario, horasTrabalhadas, valorHora);
                listaFuncionarios.add(func);
            } else if (n == 'y'){
                System.out.print("Nome: ");
                sc.nextLine();
                String nomeFuncionario = sc.nextLine();
                System.out.print("Quantidade de horas trabalhadas: ");
                int horasTrabalhadas = sc.nextInt();
                sc.nextLine();
                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();
                System.out.print("Despesa adicional: ");
                double despesaAdicional = sc.nextDouble();
                Funcionarios func = new FuncionariosTerceirizados(nomeFuncionario, horasTrabalhadas, valorHora, despesaAdicional);
                listaFuncionarios.add(func);
            }
        }
        System.out.println();
        System.out.println("Pagamentos: ");
        for (Funcionarios c : listaFuncionarios) {
            System.out.println(c.getNomeFuncionario() + " - R$" + String.format("%.2f", c.pagamento()));
        }












    }
}


