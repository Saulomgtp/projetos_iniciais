package secao1;



import java.io.File;
import java.util.Scanner;

public class ArquivosWriter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho de uma pasta: ");
        String caminhoPasta = sc.nextLine();

        File caminho = new File(caminhoPasta);

        System.out.println("getName: " + caminho.getName());
        System.out.println("getParent: " + caminho.getParent());




    }
}
