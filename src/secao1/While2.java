package secao1;
import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int x = sc.nextInt();

        while (senha != x) {
            System.out.println("Senha inválida");
            x = sc.nextInt();
        }

        System.out.println("Acesso permitido");





    }
}







