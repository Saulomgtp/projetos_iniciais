package secao1;

import java.util.Locale;

public class Main2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        String produto1 ="Computador";
        String produto2 ="Monitor";

        int idade = 30;
        int code = 5290;
        char sexo = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double valor = 53.465456;

        System.out.println("Produtos:");
        System.out.printf("%s, com o valor de R$ %.2f %n", produto1, preco1);
        System.out.printf("%s, com o valor de R$ %.2f %n", produto2, preco2);

        System.out.printf("Record: %d anos de idade, código %d e o gênero: %s %n", idade, code, sexo);

        System.out.printf("Valor com seis casas decimais: %f %n", valor);
        System.out.printf("Arrendodado : %.2f %n", valor);



    }
}// char = 1 digito apenas (entre '' simples)
// int = número inteiro
// double = número decimal
// String = texto (Entre "")

