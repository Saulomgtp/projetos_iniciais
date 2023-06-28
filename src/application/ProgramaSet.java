package application;

import entities.SetExercicioResolvido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramaSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String caminho = "C:\\Users\\Saulin\\IdeaProjects\\trainne\\exercicio.csv";
        Set<String> set = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha = br.readLine();

            while (linha != null) {
                String[] x = linha.split(" ");
                set.add(x[0]);
                linha = br.readLine();
            }

            System.out.println(set.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
