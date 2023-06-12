package secao1;
import java.util.Scanner;
public class Formas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double triangulo;
        double circulo;
        double trapezio;
        double quadrado;
        double retangulo;

        System.out.println("Digite o primeiro valor");
        a = sc.nextDouble();
        System.out.println("Digite o segundo valor");
        b = sc.nextDouble();
        System.out.println("Digite o terceiro valor");
        c = sc.nextDouble();

        triangulo = a * c /2;
        circulo = 3.14159 * c * c;
        trapezio = (a + b) / 2 * c;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("Triangulo: %.3f %n", triangulo);
        System.out.printf("Círculo: %.3f %n", circulo);
        System.out.printf("Trapézio: %.3f %n", trapezio);
        System.out.printf("Quadrado: %.3f %n", quadrado);
        System.out.printf("Retângulo: %.3f %n", retangulo);







    }
}
