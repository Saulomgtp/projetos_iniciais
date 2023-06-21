package secao1;


import entities.Circulo;
import entities.Color;
import entities.Retangulo;
import entities.Formas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class enum6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas formas geométricas você quer cadastrar? ");
        int quantidadeFormas = sc.nextInt();
        sc.nextLine();
        List<Formas> formas = new ArrayList<>();

        for (int i = 0; i < quantidadeFormas; i++) {
            System.out.println("Digite os dados da " + (i+1) + "ª forma: ");
            System.out.print("É um retangulo ou um circulo (r/c)?? ");
            char forma = sc.next().charAt(0);
            sc.nextLine();
            if (forma == 'r') {
                System.out.print("Qual a cor do seu retângulo (PRETO/AZUL/VERMELHO): ");
                String corForma = sc.nextLine();
                System.out.print("Qual a largura do seu retângulo: ");
                double larguraRetangulo = sc.nextDouble();
                System.out.print("Qual a altura do seu retângulo: ");
                double alturaRetangulo = sc.nextDouble();
                Formas form = new Retangulo(Color.valueOf(corForma), larguraRetangulo, alturaRetangulo);
                formas.add(form);
            } else if(forma == 'c') {
                System.out.print("Qual a cor do seu círculo (PRETO/AZUL/VERMELHO): ");
                String corForma = sc.nextLine();
                System.out.print("Qual o raio do seu círculo: ");
                double raioCirculo = sc.nextDouble();
                Formas form = new Circulo((Color.valueOf(corForma)), raioCirculo);
                formas.add(form);
            }
        }
        System.out.println("Áreas das formas: ");

        for (Formas list : formas) {
            System.out.println(list.areaForma());
        }
    }
}


