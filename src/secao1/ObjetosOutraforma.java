package secao1;
import entities.Triangle;

import java.util.Scanner;

public class ObjetosOutraforma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A área do triângulo X é de %.2f%n", areaX);
        System.out.printf("A área do triângulo Y é de %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A maior área é a do triângulo X");
        } else {
            System.out.println("A maior área é a do triângulo Y");
        }
    }
}



