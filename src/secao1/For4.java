package secao1;
import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de entradas");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        int y;

        for (int x = 0; x < n; x++) {
            y =sc.nextInt();
            if (y < 10 || y > 20) {
                out += 1;
            }
            else {
                in += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}




