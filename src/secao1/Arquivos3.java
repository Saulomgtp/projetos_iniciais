package secao1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivos3 {
    public static void main(String[] args) {

        String caminho = "C:\\Users\\Saulin\\Documents\\Pasta Files\\texto.txt";

      try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
          String linha = br.readLine();

          while (linha != null) {
              System.out.println(linha);
              linha = br.readLine();   // isso serve para atualizar o que vai ser "lido" pelo programa
          }
      } catch (IOException e) {
          System.out.println("Error: " + e.getMessage());
      }
    }
}
