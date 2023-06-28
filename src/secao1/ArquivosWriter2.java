package secao1;


import java.io.File;
import java.util.Scanner;

public class ArquivosWriter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma pasta: ");
        String caminhoPasta = sc.nextLine();

        File caminho = new File(caminhoPasta);

        File[] pastas = caminho.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File caminhos : pastas) {
            System.out.println(caminhos);
        }

        File[] files = caminho.listFiles(File::isFile);
        System.out.println("Files:");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucesso = new File(caminhoPasta + "\\teste").mkdir();
        System.out.println("Diretório criado com sucesso:" + sucesso);


    }
}
