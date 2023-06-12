package secao1;
import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um número");
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("é um número par");
        }
        else {
            System.out.println("é um número ímpar");
        }
        }
    }

