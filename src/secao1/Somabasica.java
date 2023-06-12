package secao1;
import java.util.Scanner;
public class Somabasica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        int soma;

        System.out.println("Digite um número inteiro");
        x = sc.nextInt();
        System.out.println("Digite outro número inteiro");
        y = sc.nextInt();
        soma = x + y;

        System.out.println("A soma dos valores digitados é de " + soma);




}
}

