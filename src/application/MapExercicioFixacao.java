package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapExercicioFixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String caminho = "C:\\Users\\Saulin\\IdeaProjects\\trainne\\exercicio.csv";

        Map<String, Integer> urna = new TreeMap<>();

        int votosAlex = 0;
        int votosMaria = 0;
        int votosBob = 0;


        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha = br.readLine();
            while (linha != null) {
                String[] x = linha.split(",");
                if (x[0].equals("Alex Blue")) {
                    votosAlex += Integer.parseInt(x[1]);
                    urna.put(x[0], votosAlex);
                } else if (x[0].equals("Maria Green")) {
                    votosMaria += Integer.parseInt(x[1]);
                    urna.put(x[0], votosMaria);
                } else if (x[0].equals("Bob Brown")) {
                    votosBob += Integer.parseInt(x[1]);
                    urna.put(x[0], votosBob);
                }
                linha = br.readLine();
            }
            for (String key : urna.keySet()) {
                System.out.println(key + ", " + urna.get(key));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
