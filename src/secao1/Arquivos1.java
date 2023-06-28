package secao1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivos1 {
    public static void main(String[] args) {
        Scanner sc = null;

        File file = new File("C:\\Users\\Saulin\\Documents\\Pasta Files\\texto.txt");      //File para abrir o arquivo de texto.    file = variavel

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
