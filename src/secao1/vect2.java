package secao1;
import java.util.Scanner;

import entities.vect22;
public class vect2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de móveis que serão cadastrados");
        int n = sc.nextInt();

        vect22[] vect = new vect22[n]; // para fazer um vetor com o objeto tem que ser dessa forma (nome da classe[] vect = new nome da classe[n]   n = quantidade de vetores armazenados
        int q = 1;
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do " + q + "º produto!!");
            String name = sc.nextLine();
            System.out.println("Digite o valor do " + q + "º produto!!");
            double price = sc.nextDouble();
            vect[i] = new vect22(name, price);
            q += 1;
        }

        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma += vect[i].getPrice();    // como eu só quero somar o preço e não importa o nome no momento, preciso colocar o get.Price para retornar o valor
        }

        double med = soma / n;

        System.out.println("Preço médio dos produtos = R$" + String.format("%.2f", med));
    }
}
