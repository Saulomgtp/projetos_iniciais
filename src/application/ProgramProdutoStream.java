package application;

import entities.ProdutoStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramProdutoStream {
    public static void main(String[] args) {

        String caminho = "C:\\Users\\Saulin\\IdeaProjects\\trainne\\exercicio.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            List<ProdutoStream> list = new ArrayList<>();

            String linha = br.readLine();
            while(linha != null) {
                String[] dados = linha.split(",");   //lembrar de dividir os dados do texto
                list.add(new ProdutoStream(dados[0], Double.parseDouble(dados[1])));
                linha = br.readLine();
            }


            double media = list.stream().map(x -> x.getPrecoProduto()).reduce(0.0, (x, y) -> x + y) / list.size();   //usar reduce para fazer a soma e depois o / pra dividir

            System.out.print("Preço médio: R$" + String.format("%.2f", media));
            System.out.println();


            List<String> nomes = list.stream().filter(p -> p.getPrecoProduto() < media).map(x -> x.getNomeProduto()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            nomes.forEach(System.out::println);
//                                       filtrando os que são menores que a média /\        /\ falando que só quer o nome     /\ordenando de trás pra frente

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
