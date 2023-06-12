package secao1;
import java.util.Scanner;
public class DiferencadeValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        int z;
        int a;
        int diferenca;

        System.out.println("Digite o primeiro valor");
        x = sc.nextInt();
        System.out.println("Digite o segundo valor");
        y = sc.nextInt();
        System.out.println("Digite o terceiro valor");
        z = sc.nextInt();
        System.out.println("Digite o quarto valor");
        a = sc.nextInt();

        diferenca = (x*y-z*a);

        System.out.println("A diferença do primeiro e segundo valor para o teceiro e quarto é de " + diferenca);








    }
}
