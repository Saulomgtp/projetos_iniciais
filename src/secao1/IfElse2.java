package secao1;
import java.util.Scanner;
public class IfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um número");
        x = sc.nextInt();

        if (x >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

    }
}
