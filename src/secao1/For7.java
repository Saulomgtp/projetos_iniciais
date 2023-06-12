package secao1;
import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int n = 1;n <= x;n++) {
            if(x % n == 0) {
                System.out.println(n);
            }
        }



    }
}




