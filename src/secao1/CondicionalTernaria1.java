package secao1;
import java.util.Scanner;

public class CondicionalTernaria1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();
        double desconto = (preco > 20) ? preco * 0.1 : preco * 0.05;

        System.out.printf("O desconto vai ser de R$%.2f%n", desconto);


        }
    }








