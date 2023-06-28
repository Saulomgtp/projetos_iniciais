package secao1;


import entities.ProdutoArquivo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoFileBufferedWriter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String caminho = "C:\\Users\\Saulin\\IdeaProjects\\trainne\\exercicio.csv";
        List<ProdutoArquivo> frases = new ArrayList<>();

        try (BufferedReader arquivo = new BufferedReader(new FileReader(caminho))) {
            String linha = arquivo.readLine();
            while (linha != null) {
                String[] dados = linha.split(",");
                String nomee = dados[0];
                Double precoo = Double.valueOf(dados[1]);
                Integer quantidadee = Integer.valueOf(dados[2]);
                ProdutoArquivo prod = new ProdutoArquivo(nomee, precoo, quantidadee);
                frases.add(prod);
                linha = arquivo.readLine();
            }
            //        aqui pra cima leu e escreveu os dados nas listas /\
        }
        catch (IOException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        //    aqui pra cima escreveu as frases na lista frases

            new File("C:\\Users\\Saulin\\IdeaProjects\\trainne" + "\\saulinn").mkdir();

            //aqui em cima eu criei a pasta onde o arquivo será inserido

            String arquivoCriado = "C:\\Users\\Saulin\\IdeaProjects\\trainne\\saulinn\\summary.csv";

            //aqui eu estou criando a variável com o nome do arquivo que será criado

           try (BufferedWriter escreverArquivo = new BufferedWriter(new FileWriter(arquivoCriado))) {

            for (ProdutoArquivo frase : frases) {
                escreverArquivo.write(frase.toString());
                escreverArquivo.newLine();    // isso é feito para ter a quebra de linhas, ficar um dado em cada linha
            }
            // aqui /\ eu escrevi no arquivo que eu criei
        }
        catch (IOException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
// FEITA COM OBJETO PRODUTOARQUIVO