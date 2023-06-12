package secao1;
import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;

        for (int rep = 0; rep < n; rep++) {
            int valor = sc.nextInt();
            soma += valor;
        }
        System.out.println(soma);
    }
}







