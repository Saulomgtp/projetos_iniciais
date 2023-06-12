package secao1;
import java.util.Scanner;

public class IfElse8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fixo = 50.00;
        double extra = 2.00;
        double variavel;

        System.out.println("Digite a quantidade de minutos utilizados");

        double minutos = sc.nextInt();

        if (minutos <=100) {
            System.out.printf("Valor a pagar: R$%.2f %n", fixo);
        } else {
            variavel = ((minutos - 100) * extra) + fixo;
            System.out.printf("Valor a se pagar: R$%.2f %n", variavel);
        }
    }
}







