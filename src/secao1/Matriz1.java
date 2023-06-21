package secao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }

        System.out.println("Números na diagonal principal: ");
        for(int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

            int numerosNegativos = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    if (mat[i][j] < 0) {
                        numerosNegativos += 1;
                    }
            }
            System.out.println();
            System.out.println("Números negativos: " + numerosNegativos);


        }
    }



