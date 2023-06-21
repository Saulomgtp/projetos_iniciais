package secao1;


import java.util.Scanner;

public class vect7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        int vect[] = new int[n];  //iniciando vetor falando que ele vai armazenar n números

        int q = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o seu " + q + "º número");
            vect[i] = sc.nextInt();
            q += 1;
        }

        int maiorValor = vect[0];
        int posicao = 0;

        for (int i = 0; i < n; i++) {
            if (vect[i] > maiorValor) {       //aqui eu chamei > variável e não que o vetor
                maiorValor = vect[i];
                posicao = i;
            }
        }
        System.out.println("O maior valor digitado foi de: " + maiorValor);
        System.out.println("A posição do maior valor é " + posicao);















        }
    }


