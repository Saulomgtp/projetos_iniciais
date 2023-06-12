package secao1;
import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int x = sc.nextInt();

        while (x != 4) {
            if (x > 4 || x < 1) {
                System.out.println("Favor digitar um código entre 1 e 3");
            } else if(x == 1) {
                alcool += + 1;
            }
              else if(x == 2) {
                gasolina += + 1;
            }
              else {
                  diesel += 1;
            }
              x = sc.nextInt();
        }
        System.out.println("Muito obrigado!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}








