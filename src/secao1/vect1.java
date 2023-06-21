package secao1;
import java.util.Scanner;

public class vect1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas que você deseja armazenar o tamanho");
        int n = sc.nextInt();

        double [] vect = new double [n];      // tipo do vetor/ [] padrão/ nome do vetor/ = new / tipo do vetor / [quantidade];

        int p = 1;


        for (int i = 0; i < n; i++) {
            System.out.println("Digite a altura da " + p + "ª pessoa!!");
            vect[i] = sc.nextDouble();// variável (vect) na posição i (que foi declarada 0 que é a primeira posição do vetor)
            p += 1;
        }

        // criar 2 for, 1 pra pegar os dados e colocar no vetor e outro para somar eles, com a mesma variável (n)

        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double media = soma / n;

        System.out.println("A média de altura entre as " + (p - 1) + " pessoas é de " + String.format("%.2f", media) + " metros!!");
    }
}
