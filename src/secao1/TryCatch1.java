package secao1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        method1();


        System.out.println("Fim do programa");
    }

    public static void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Começo do método 1*******");

        method2();









        System.out.println("*******Fim do método 1*******");
    }
    public static void method2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("*******Começo do método 2*******");

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Erro de input");
        }

        System.out.println("*******Fim do método 2*******");
    }
}


