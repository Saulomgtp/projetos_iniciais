package secao1;

import entities.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lista2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();


        System.out.println("Qual a quantidade de funcionários que você deseja cadastrar?");
        int quantidadeFuncionarios = sc.nextInt();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("Funcionário " + (i + 1) + ": ");
            System.out.println("Código: ");
            int codigoFuncionario = sc.nextInt();
            System.out.println("Nome: ");
            sc.nextLine();
            String nomeFuncionario = sc.nextLine();
            System.out.println("Salário ");
            double salarioFuncionário = sc.nextDouble();    // já tenho meus dados armazenados nas 3 variáveis
            // agora eu preciso armazenar eles no meu construtor, para eles irem para o meu objeto

            Funcionario func = new Funcionario(codigoFuncionario, nomeFuncionario, salarioFuncionário);

            //agora os dados das minhas variáveis estão armazenadas no meu construtor
            //preciso adicionar elas na minha lista criada (funcionarios)

            funcionarios.add(func); //não é na minha classe, é na minha variável instanciada;
        }
        System.out.print("Digite o código do funcionário que terá o salário aumentado: ");
        int codigo = sc.nextInt();


        //                  nome da lista           \/ padrão para iniciar filtros            x.getCodigoFuncionario é o que vai ser comparado
        Funcionario func = funcionarios.stream().filter(x -> x.getCodigoFuncionario() == codigo).findFirst().orElse(null);
        //func = armazenar o resultado                                              == codigo é a comparação             .findFirst().orElse(null) para trazer o primeiro que encontrar ou nulo
        if (func == null) {
            System.out.println("Esse código não existe!");
        } else {
            System.out.print("Entre com a porcentagem: ");
            double porcentagem = sc.nextDouble();
            func.aumentoSalario(porcentagem);
        }
        System.out.println("Lista de funcionários: ");
        for (Funcionario x : funcionarios) {
            System.out.println(x);
        }
    }
}










