package secao1;

import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {
        double x = 10.35784;
        String nome = "Maria";
        int idade = 20;


        System.out.printf("%.2f%n",x);
        System.out.println(x);
        System.out.printf("%.4f%n",x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);

        System.out.println("O resultado é = "+ x + " Metros");
        System.out.printf("RESULTADO = %.2f metros%n", x);

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais por mês %n", nome, idade, x);
    }// %f = ponto flutuante (double)
    // %d = inteiro (int)
    // %s = texto (String)
    // %n = quebra de linha (no final do texto (imitar o println)
    // .2 = quantidade de casas decimais
    // mudar , pra . = usar Locale.setDefault(Locale.US) no começo do código fonte
}
