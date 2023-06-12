package secao1;
import java.util.Scanner;

public class IfElse5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int inicio;
       int fim;
       int resultado;
       System.out.println("Digite a hora em que o jogo iniciou");
       inicio = sc.nextInt();
       System.out.println("Digite a hora em que o jogo terminou");
       fim = sc.nextInt();

       if (inicio >= fim) {
           resultado = 24 - inicio + fim;
           System.out.printf("O jogo durou %d hora(s)", resultado);
       }
       else {
           resultado = fim - inicio;
           System.out.printf("O jogo durou %d hora(s)", resultado);
       }
    }
    }

