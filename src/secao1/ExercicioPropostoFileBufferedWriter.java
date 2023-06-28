package secao1;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoFileBufferedWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String caminho = "C:\\Users\\Saulin\\IdeaProjects\\trainne\\exercicio.csv";
        List<String> nome = new ArrayList<>();
        List<Double> preco = new ArrayList<>();
        List<Integer> quantidade = new ArrayList<>();
        List<String> frases = new ArrayList<>();

        try (BufferedReader arquivo = new BufferedReader(new FileReader(caminho))) {
            String linha = arquivo.readLine();
            while (linha != null) {
                String[] dados = linha.split(",");
                String nomee = dados[0];
                Double precoo = Double.valueOf(dados[1]);
                Integer quantidadee = Integer.valueOf(dados[2]);
                nome.add(nomee);
                preco.add(precoo);
                quantidade.add(quantidadee);
                linha = arquivo.readLine();
            }
            //        aqui pra cima leu e escreveu os dados nas listas /\

            for (int i = 0; i < nome.size(); i++) {
                String elemento = nome.get(i) + ", " + String.format("%.2f", (preco.get(i) * quantidade.get(i)));
                frases.add(elemento);
            }
        }
        catch (IOException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        //    aqui pra cima escreveu as frases na lista frases

            new File("C:\\Users\\Saulin\\IdeaProjects\\trainne" + "\\saulin").mkdir();

            //aqui em cima eu criei a pasta onde o arquivo será inserido

            String arquivoCriado = "C:\\Users\\Saulin\\IdeaProjects\\trainne\\saulin\\summary.csv";

            //aqui eu estou criando a variável com o nome do arquivo que será criado

           try (BufferedWriter escreverArquivo = new BufferedWriter(new FileWriter(arquivoCriado))) {

            for (String frase : frases) {
                escreverArquivo.write(frase);
                escreverArquivo.newLine();    // isso é feito para ter a quebra de linhas, ficar um dado em cada linha
            }
            // aqui /\ eu escrevi no arquivo que eu criei
        }
        catch (IOException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
