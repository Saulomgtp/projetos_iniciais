package secao1;
import java.util.Scanner;
public class RaiodoCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi;
        double raio;
        double area;

        pi = 3.14159;
        System.out.println("Digite o valor do raio do círculo");
        raio = sc.nextDouble();

        area = pi * (raio*raio);

        System.out.printf("O valor da área deste círculo é de %.4f %n", area);


        sc.close();
    }
}