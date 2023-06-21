package secao1;

import java.util.Scanner;

public class vect4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números reais");
        int n = sc.nextInt();

        int vect [] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número");
            vect [i] = sc.nextInt();
        }

        int soma = 0;

        System.out.print("Valores digitados: ");

        for (int i = 0; i < n; i++) {
            System.out.print(vect [i] + " ");
            soma += vect [i];
        }
        int med = soma / n;

        System.out.println();
        System.out.println("A soma entre os valores é de " + soma);
        System.out.println("A média entre os valores é de " + med);













    }
}

