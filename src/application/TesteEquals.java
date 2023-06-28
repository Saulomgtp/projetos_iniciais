package application;

import entities.ClienteEquals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClienteEquals x1 = new ClienteEquals("Maria", "maria@gmail.com");
        ClienteEquals x2 = new ClienteEquals("Maria", "maria@gmail.com");

        System.out.println(x1.hashCode());
        System.out.println(x2.hashCode());
        System.out.println(x1.equals(x2));






    }
}
