package application;

import java.util.Scanner;
import entities.Ex5;

public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex5 rect = new Ex5();

        System.out.println("Digite o nome do aluno");
        rect.aluno = sc.nextLine();

        System.out.println("Digite a nota do primeiro semestre");
        rect.nota1 = sc.nextInt();

        while (rect.nota1 > 30 || rect.nota1 < 0) {
            System.out.println("Nota fora dos padrões empregados, digite a nota que deve ser entre 0 e 30");
            rect.nota1 = sc.nextInt();
        }

        System.out.println("Digite a nota do segundo semestre");
        rect.nota2 = sc.nextInt();

        while (rect.nota2 > 35 || rect.nota2 < 0) {
            System.out.println("Nota fora dos padrões empregados, digite a nota que deve ser entre 0 e 35");
            rect.nota2 = sc.nextInt();
        }

        System.out.println("Digite a nota do terceiro semestre");
        rect.nota3 = sc.nextInt();

        while (rect.nota3 > 35 || rect.nota3 < 0) {
            System.out.println("Nota fora dos padrões empregados, digite a nota que deve ser entre 0 e 35");
            rect.nota3 = sc.nextInt();
        }

        System.out.println(rect);

        if (rect.soma() < 60) {
            System.out.println("Você foi reprovado!");
            System.out.println("Você reprovou por " + (60 - rect.soma()) + " pontos.");
        } else {
            System.out.println("Parabéns!! Você passou!");
        }
    }
}















