package secao1;

import entities.Aluguel;

import java.util.Scanner;

public class Vect13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluguel[] totalQuartos = new Aluguel[10];

        System.out.println("Quantos quartos serão alugados?");
        int quantidadeQuartos = sc.nextInt();

        for(int i = 1; i <= quantidadeQuartos; i++) {
            System.out.println("Aluguel do quarto " + i);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();
            totalQuartos[numeroQuarto] = new Aluguel(nome, email);
        }
        System.out.println("Quartos Ocupados: ");

        for(int i = 1; i < 10; i++) {
            if(totalQuartos[i] != null) {
                System.out.println(i + ": " + totalQuartos[i]);
            }
        }


















    }
}


