package secao1;

import entities.Aluguel;

import java.util.Scanner;

public class VectForeach13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        for (String obj : vect) {              // uma forma de percorrer todo o vetor              for (tipo primitivo nome variavel : vect(nome do vetor criado)
            System.out.println(obj);
        }






    }
}



















