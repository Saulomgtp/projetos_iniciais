package secao1;
import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       for (int i = 1; i <= n; i++) {
           if (n >= 1) {
               int a = i;
               int b = i*i;
               int c = i*i*i;
               System.out.printf("%d %d %d %n", a, b, c);
           } else {
               System.out.println("Insira um número inteiro positivo!");
           }
       }

    }
}




