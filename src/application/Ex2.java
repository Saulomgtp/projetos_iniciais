package application;

import java.util.Scanner;
import entities.Ex1;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ex1 rect = new Ex1();

        System.out.println("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.println("Area = " + rect.area());
        System.out.println("Perimeter = " + rect.perimeter());
        System.out.println("Diagonal = " + rect.diagonal());





    }
}