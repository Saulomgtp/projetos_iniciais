package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExercicioFixacaoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("Quantos estudantes no curso A? ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o código dos " + x + " alunos presentes na turma A!");
        for (int i = 0; i < x; i++) {
            int n = sc.nextInt();
            set.add(n);
        }

        System.out.print("Quantos estudantes no curso B? ");
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o código dos " + y + " alunos presentes na turma B!");
        for (int i = 0; i < y; i++) {
            int n = sc.nextInt();
            set.add(n);
        }

        System.out.print("Quantos estudantes no curso C? ");
        int z = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o código dos " + z + " alunos presentes na turma B!");
        for (int i = 0; i < z; i++) {
            int n = sc.nextInt();
            set.add(n);
        }

        System.out.print("Quantidade total de estudantes: ");
        System.out.println(set.size());

        System.out.println();

        System.out.println("E esses são os alunos: ");
        for (Integer list : set) {
            System.out.println(list);
        }

    }
}
