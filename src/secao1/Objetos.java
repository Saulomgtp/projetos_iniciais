package secao1;
import java.util.Scanner;

public class Objetos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as 3 medidas do triângulo x");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double x3 = sc.nextDouble ();
        double p1 = (x1+x2+x3)/2;
        double a1 = Math.sqrt(p1*(p1-x1)*(p1-x2)*(p1-x3));
        System.out.println("Digite as 3 medidas do triângulo y");
        double y1 = sc.nextDouble ();
        double y2 = sc.nextDouble ();
        double y3 = sc.nextDouble();
        double p2 = (y1+y2+y3)/2;
        double a2 = Math.sqrt(p2*(p2-y1)*(p2-y2)*(p2-y3));

        System.out.printf("A área do triângulo X é de %.2f%n", a1);
        System.out.printf("A área do triângulo Y é de %.2f%n", a2);

        if (a1 > a2) {
            System.out.println("A maior área é a do triângulo X");
        } else {
            System.out.println("A maior área é a do triângulo Y");
        }
    }
}




