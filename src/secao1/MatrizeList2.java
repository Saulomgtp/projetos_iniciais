package secao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizeList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][5];

        for (int i = 0; i < 3 ; i++ ) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        int contNumerosPares = 0;
        int contNumerosImpares = 0;
        for (int i = 0; i < 3 ; i++ ) {
            for (int j = 0; j < 5; j++) {
                if (mat[i][j] % 2 == 0) {
                    contNumerosPares += 1;
                    numerosPares.add(mat[i][j]);
                } else {
                    contNumerosImpares += 1;
                    numerosImpares.add(mat[i][j]);
                }
            }
        }

        System.out.println("A quantidade de números pares na nossa matriz é de: ");
        System.out.println(contNumerosPares + " números");
        System.out.println("E os números pares são: ");
        for (Integer listaPares : numerosPares) {
            System.out.print(listaPares + ", ");
        }
        System.out.println();

        System.out.println("A quantidade de números ímpares na nossa matriz é de: ");
        System.out.println(contNumerosImpares + " números");
        System.out.println("E os números ímpares são: ");
        for (Integer listaImpares : numerosImpares) {
            System.out.print(listaImpares + ", ");
        }
    }
}



