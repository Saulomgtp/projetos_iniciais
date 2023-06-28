package application;

import entities.ExercicioFixacaosecao20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgramExercFixacao20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String caminho = "C:\\Users\\Saulin\\IdeaProjects\\trainne\\exercicio.csv";

        List<ExercicioFixacaosecao20> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha = br.readLine();

            while(linha != null) {
                String[] dados = linha.split(",");
                lista.add(new ExercicioFixacaosecao20(dados[0], dados[1], Double.parseDouble(dados[2])));  //lembrar de dividir os dados do texto
                linha = br.readLine();
            }

            System.out.print("Entre com o salário para a base do cálculo: ");
            double salario = sc.nextDouble();

            List<String> emails = lista.stream().filter(x -> x.getSalario() > salario).map(x -> x.getEmail()).sorted().collect(Collectors.toList());
                                                                                                                     //sempre que transformar em stream, tem que voltar pra list
            System.out.println("Email das pessoas com um salário maior que R$" + String.format("%.2f", salario));

            emails.forEach(System.out::println);


            //                                     x.getNome().charAt(0) == 'M')
            Double soma = lista.stream().filter(x -> x.getNome().startsWith("M")).map(x -> x.getSalario()).reduce(0.0, (x,y) -> x + y);//não quero retornar uma lista e sim um valor

            System.out.println("A soma dos salários das pessoas que iniciam com a letra M é de: R$" + String.format("%.2f", soma));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
