package secao1;

import entities.vect111;

import java.util.Scanner;

public class vect11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você vai digitar?");

        int n = sc.nextInt();

        vect111[] vect = new vect111[n];

        int p = 1;
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados da " + p + "ª pessoa!");
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            vect[i] = new vect111(name, idade);   // armazenar as duas variáveis nos construtores na posição i
            p += 1;
        }
        int posicao = 0;
        int maior = vect[0].getIdade();

        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() > maior) {
                maior = vect[i].getIdade();
                posicao = i;
            }
        }
        System.out.println("A pessoa mais velha é o(a): " + vect[posicao].getNome() + " e ele(a) tem " + vect[posicao].getIdade() + " anos de idade");
        }
}


