package secao1;


import java.util.Scanner;

public class vect9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vão ter o vetor?");
        int n = sc.nextInt();

        double [] vect = new double[n];

        double media;
        double soma = 0;
        int q = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor do " + q + "º vetor: ");
            vect [i] = sc.nextDouble();
            q += 1;
        }

        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        media = soma / n;

        System.out.println("Média do vetor: " + String.format("%.3f", media));
        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
            }
        }
    }
}


