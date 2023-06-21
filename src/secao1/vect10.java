package secao1;


import java.util.Scanner;

public class vect10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos elementos vai ter o vetor");
        int n = sc.nextInt();

        int [] vect = new int[n];

        int q = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o seu " + q + "º número!");
            vect[i] = sc.nextInt();
            q += 1;
        }
        int soma = 0;
        int p = 0;
        int media = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                p += 1;
                media = soma / p;
            }
        }
        if (p > 0) {
            System.out.println("A Média entre os números pares é de " + media);
        } else {
            System.out.println("Não houve números pares escrítos");
        }
    }
}


