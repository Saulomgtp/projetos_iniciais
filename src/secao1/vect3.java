package secao1;

import java.util.Scanner;

public class vect3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro menor que 10");
        int n = sc.nextInt();
        while (n > 10) {
            System.out.println("Número inválido. Digite um número inteiro menor que 10");
            n = sc.nextInt();
        }
        int [] vect = new int [n];
        int x = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o seu " + x + "º número!!");
            vect[i] = sc.nextInt();
            x += 1;
        }
        System.out.println("Números negativos: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
    }
}

