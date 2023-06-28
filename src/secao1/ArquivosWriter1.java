package secao1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivosWriter1 {
    public static void main(String[] args) {

        String [] lines = new String[] { "Bom dia", "Boa tarde", "Boa noite"};

        String caminho = "C:\\Users\\Saulin\\Documents\\Pasta Files\\out.txt";


                                                                    // se colocar ,true não destroi o arquivo, adiciona os dados
        //try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
