package secao1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> valores = new ArrayList<>();
        int x = 5;

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + " valor.");
            int y = sc.nextInt();
            valores.add(y);
        }

        for(Integer z : valores) {
            System.out.println(z);
        }









    }
}


