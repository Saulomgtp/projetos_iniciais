package secao1;


import java.util.Scanner;

public class vect6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números inteiros que você quer armazenar");
        int n = sc.nextInt();

        int [] vect = new int[n];    //classe [] variável = new classe[quantidade de valores que vai armazenar];
        int q = 1;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o seu " + q + "º número!!");
            vect[i] = sc.nextInt();
            q += 1;
        }
        System.out.println("Os números pares digitados foram: ");

        for(int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
            }
        }

        System.out.println();

        int soma = 0;

        for(int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                soma += 1;
            }
        }

        System.out.println();

        System.out.println("A quantidade de números pares digitados é de: " + soma);
        }
    }


