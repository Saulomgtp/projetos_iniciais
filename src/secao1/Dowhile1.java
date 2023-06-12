package secao1;
import java.util.Scanner;

public class Dowhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double t;
        double f;
        char x;

        do {
            System.out.println("Digite a temperatura em Celsius");
            t = sc.nextDouble();
            f = (9 * t)/5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", f);
            System.out.println("Deseja repetir (s/n)?");
            x = sc.next().charAt(0);
        } while (x == 's');
        System.out.println("Obrigado por usar nosso programa");
    }
}
// não é tão utilizada mas é simples de fazer



