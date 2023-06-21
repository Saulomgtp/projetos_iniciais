package secao1;


import entities.Contratos;
import entities.Trabalhador;
import entities.NivelTrabalhador;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import entities.Departamento;


public class enum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o nome do Departamento do funcionário: ");
        String departamento = sc.nextLine();
        Departamento depart = new Departamento(departamento);



        System.out.println("Entre com os dados do trabalhador");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o nível do trabalhador: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Digite o salário base do operador: ");
        double salarioBase = sc.nextDouble();


                                                //  classe enum.valueOf(variável)
        Trabalhador trab = new Trabalhador (nome, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, depart);

        System.out.print("Quantos contratos tem esse funcionário?");
        int quantidadeContratos = sc.nextInt();

        for (int i = 0; i < quantidadeContratos; i++) {
            System.out.println("Digite os dados do " + (i+1) + "º contratos!");
            System.out.print("Data (DD/MM/YYYY): ");
            sc.nextLine();
            String dataContrato = sc.nextLine();
            System.out.print("Valor por hora do contrato: ");
            double valorHora = sc.nextDouble();
            System.out.print("Quantidade de horas do contrato: ");
            int quantidadeHoras = sc.nextInt();
            //peguei a variável dataContrato em String e transformei ela em um tipo LocalDate. Depois eu formatei ela com o DateTimeFormatter
            LocalDate dataContrat = LocalDate.parse(dataContrato, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Contratos contrato = new Contratos(dataContrat, valorHora, quantidadeHoras);

            trab.adicionarContrato((contrato));
        }

        System.out.print("Entre com o mês e ano que você deseja calcular a renda (MM/YYYY): ");
        sc.nextLine();
        String dataReferencia = sc.nextLine();
        LocalDate dataRef = LocalDate.parse("01/" + dataReferencia, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int mesRef = dataRef.getMonthValue();
        int anoRef = dataRef.getYear();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/yyyy");

        double renda = trab.renda(anoRef, mesRef);
        System.out.println("Nome: " + trab.getNomeTrabalhador());
        System.out.println(depart);
        System.out.println("Renda de " + dataRef.format((fmt1)) + ": R$" + renda);

    }
}


