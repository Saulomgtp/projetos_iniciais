package secao1;

import entities.Aluno1;

import java.util.Scanner;

public class vect12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serão digitados?");
        int numeroAlunos = sc.nextInt();

        Aluno1[] alunos = new Aluno1[numeroAlunos];

        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("Digite o nome do " + (i+1) + "º aluno.");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Digite a quantidade de notas que serão inseridas.");
            int quantidadeNotas = sc.nextInt();
            double[] notas = new double[quantidadeNotas];

            for(int j = 0; j < quantidadeNotas; j++) {
                System.out.println("Digite o valor da "+ (j+1) + "ª nota.");
                notas[j] = sc.nextDouble();
            }
            alunos[i] = new Aluno1(nome, notas);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < numeroAlunos; i++) {
            if (alunos[i].getMedia() >= 6.0) {
                System.out.println(alunos[i].getNome());
            }
        }
    }
}


