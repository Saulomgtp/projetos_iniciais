package application;

import entities.PrintService;

import java.util.Scanner;

public class ProgramaPrintService {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("Quantos valores serão digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String valor = sc.nextLine();
            ps.adicionarValor(valor);
        }


        ps.print();
        System.out.println();
        System.out.println("Primeiro valor: " + ps.primeiroNumero());








    }
}
