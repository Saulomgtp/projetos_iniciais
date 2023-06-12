package secao1;
import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Digite 2 números");

        x = sc.nextInt();
        y = sc.nextInt();

        if  (x % y == 0 || y % x == 0) {
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }

    }
    }

