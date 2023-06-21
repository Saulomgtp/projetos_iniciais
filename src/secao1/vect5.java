package secao1;

import java.util.Scanner;

import entities.vect55;

public class vect5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas que serão cadastradas.");
        int n = sc.nextInt();

        vect55[] vect = new vect55[n];

        int x = 1;

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite os dados da " + x + " pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.println();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.println();
            vect[i] = new vect55(nome, idade, altura);
            x += 1;
        }
        double soma = 0;

        for (int i = 0; i < n ; i++) {
            soma += vect[i].getAltura();        //forma de trazer um valor vetor do objeto
        }
        double med = soma / n;

        System.out.println("A altura média é de "+ String.format("%.2f", med));

        double p = 0;
        for(int i = 0; i < n ; i++) {
            if(vect[i].getIdade() < 16) {           //forma de trazer um valor vetor do objeto
                p += 1;
            }
        }
        double porcentagem = p / n * 100;
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", porcentagem) + "%");

        for(int i = 0; i < n ; i++) {
            if(vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());           //forma de trazer um valor vetor do objeto
            }
        }

















    }
}

