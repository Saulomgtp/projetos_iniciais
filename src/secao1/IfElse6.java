package secao1;
import java.util.Scanner;

public class IfElse6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cod;
        double qnt;
        double total;
        double cachorroquente;
        double xsalada;
        double xbacon;
        double torrada;
        double refrigerante;
        cachorroquente = 4.00;
        xsalada = 4.50;
        xbacon = 5.00;
        torrada = 2.00;
        refrigerante = 1.50;

        System.out.println("Digite o código do produto desejado");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade de unidades desejadas");
        qnt = sc.nextInt();

        if (cod == 1) {
            total = cachorroquente * qnt;
        }
        else if (cod == 2) {
            total = xsalada * qnt;
        }
        else if (cod == 3) {
            total = xbacon * qnt;
        }
        else if (cod == 4) {
            total = torrada * qnt;
        }
        else {
            total = refrigerante * qnt;
        }
        total++;
        System.out.printf("Total a ser pago: R$%.2f%n", total);

    }
    }

// poderia ter colocado apenas um system no final, pois a variável é a mesma
//não precisava criar um banco de dados com o nome e valor dos itens

