package secao1;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class enum7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de pessoas que serão taxadas: ");
        int numeroPessoas = sc.nextInt();
        sc.nextLine();
        List<Contribuintes> pessoas = new ArrayList<>();
        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa: ");
            System.out.print("Pessoa física ou jurídica (f/j)? ");
            char pess = sc.next().charAt(0);
            sc.nextLine();
            if(pess == 'f') {
                System.out.print("Nome: ");
                String nomePessoa = sc.nextLine();
                System.out.print("Ganho Anual: ");
                Double ganhoAnual = sc.nextDouble();
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();

                Contribuintes pessoass = new PessoaFisica(nomePessoa, ganhoAnual, gastosSaude);
                pessoas.add(pessoass);
            } else if (pess == 'j') {
                System.out.print("Nome: ");
                String nomePessoa = sc.nextLine();
                System.out.print("Ganho Anual: ");
                Double ganhoAnual = sc.nextDouble();
                System.out.print("Número de funcionários: ");
                int numeroFuncionarios = sc.nextInt();

                Contribuintes pessoass = new PessoaJuridica(nomePessoa, ganhoAnual, numeroFuncionarios);
                pessoas.add(pessoass);
            }
        }
        System.out.println();
        System.out.println("Impostos pagos: ");

        double soma = 0;
        for (Contribuintes pessoa : pessoas) {
            System.out.printf("%s: R$%.2f \n", pessoa.getNomeContribuinte(), pessoa.impostoPago());
            soma += pessoa.impostoPago();
        }
        System.out.println();
        System.out.printf("Impostos totais: R$%.2f", soma);
    }
}


