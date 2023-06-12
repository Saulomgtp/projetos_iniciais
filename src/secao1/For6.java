package secao1;
import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas vezes quer utilizar o programa");
        int x = sc.nextInt();
        int n1;
        int n2;
        double div;

        for (int i = 0; i < x; i++) {
            System.out.println("Digite dois valores");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            if (n2 == 0) {
                System.out.println("Divisão impossível");
            } else {
                div = (double) n1/n2;
                System.out.println("O resultado da divisão é " + div);
            }
        }
    }
}




