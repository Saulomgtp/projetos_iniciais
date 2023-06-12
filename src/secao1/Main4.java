package secao1;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        System.out.println("Você digitou: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Você digitou o número: " + y);

        double z;
        z = sc.nextDouble();
        System.out.printf ("Você digitou o número: %.2f %n", z);




        sc.close();
    }
}// sc.next(); para o programa aguardar a entrada de dados do usuário
// sc.nextint();
// sc.nextDouble();
//para ler 1 caracter apenas usar o sc.next().charAt(0)        porém deve criar a variavel como char = x
