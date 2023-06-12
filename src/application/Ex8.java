package application;

import java.util.Scanner;

import entities.Ex7;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex7 rect = new Ex7();

        System.out.print("Digite a cotação atual do dólar: ");
        rect.dolar = sc.nextDouble();
        System.out.print("Quantos dólares você quer comprar?: ");
        rect.compra = sc.nextDouble();
        System.out.println(rect);
    }
}
