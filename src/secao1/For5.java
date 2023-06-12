package secao1;
import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes que quer utilizar o programa");
        int n = sc.nextInt();

        double x1;
        double x2;
        double x3;
        double med;

        for(int x = 0; x < n; x++) {
            System.out.println("Digite 3 valores");
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            x3 = sc.nextDouble();

            med = ((x1*2)+(x2*3)+(x3*5))/10;
            System.out.printf("A média ponderada entre os 3 número considerando o peso é de %.1f%n", med);
        }

    }
}




